
package atividade10_mariag;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

import java.util.ArrayList;
import java.util.List;



public class ConexaoDAO {
    
    private static  Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Atividade10";
        String usuario = "root";
        String senha = "root";
        Connection conexao = null;
        
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexao estabelecida");
        }
        catch (SQLException e){
            System.out.println("Erro na conexao");
        }
            
        return conexao;    
          
    };
    
            
    public void cadastrarAluno(Aluno alunos ){
        String sql = "INSERT INTO aluno (nome) VALUES (?) ";
        
        try( Connection conexao = getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)){
                
            stmt.setString(1, alunos.getNome());
           
            stmt.executeUpdate();
             
            try(ResultSet rs = stmt.getGeneratedKeys()){
            
                if (rs.next()) {
                    int idGerado = rs.getInt(1);

                    alunos.setId(idGerado);

                    System.out.println("Aluno cadastrado com sucesso! ID: " + alunos.getId());
                 }
            }
        }
            catch(SQLException e){
                System.out.println("Erro ao cadastrar aluno: " + e.getMessage());
            }
 
    }
    

    public List<Aluno> listarAlunos(){
       List<Aluno> listaAlunos = new ArrayList<>();
       String sql = "SELECT id, nome FROM aluno;";
       
        try (Connection conexao = getConnection();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()){

            while(rs.next()){
                Aluno alunos = new Aluno();

                alunos.setId(rs.getInt("id"));
                alunos.setNome(rs.getString("nome"));
                listaAlunos.add(alunos);  
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return listaAlunos;
    }
    
    
   public void atualizarAlunos(Aluno alunos){
       String sql = "UPDATE aluno SET nome = ? WHERE id = ?";
       
           try( Connection conexao = getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)){
                
            stmt.setInt(2, alunos.getId());    
            stmt.setString(1, alunos.getNome());
           
            stmt.executeUpdate();
                
            System.out.println("Dados atualizados com sucesso! ID: " + alunos.getId());
        }
            catch(SQLException e){
                System.out.println("Erro ao atualizar aluno: " + e.getMessage());
            }
   }
   
   public void deletarAluno(int id, Aluno alunos){
       String sql = "DELETE FROM aluno WHERE id = ?";
       
        try( Connection conexao = getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)){
                
            stmt.setInt(1, alunos.getId());    
           
            stmt.executeUpdate();
                
            System.out.println("Dados deletados com sucesso! ID: " + alunos.getId());
        }
            catch(SQLException e){
                System.out.println("Erro ao deletar aluno: " + e.getMessage());
            }
       
   }
}


package sac.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class SacDAO {
    
    
    public List<Sac> lista(){
        
        String sql="select codigo, cpf, nome, datareclamacao, dataresposta, reclamacao,"
                + "resposta from sac order by codigo;";
        List<Sac> lista =new ArrayList<>();
        try (Connection conn = Conecta.abreConexaoBanco()){
            if(conn !=null){
                try(PreparedStatement ps = conn.prepareStatement(sql)) {
                    try(ResultSet rs = ps.executeQuery()) {
                        while(rs.next()){
                            lista.add(new Sac(rs.getInt("codigo"),
                                    rs.getString("cpf"),
                                    rs.getString("nome"), 
                                    rs.getDate("datareclamacao"),
                                    rs.getDate("dataresposta"),
                                    rs.getString("reclamacao"),
                                    rs.getString("resposta")));
                            
                        }
                    } catch (Exception e) {
                    }
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
        }              
        return lista;
    }
    
    
    
        
}

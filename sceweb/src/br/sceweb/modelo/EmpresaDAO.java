package br.sceweb.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.sceweb.servico.FabricaDeConexoes;

public class EmpresaDAO {
	
	public int adiciona(Empresa empresa){
		
		return 1;
	}

}
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import br.sceweb.servico.FabricaDeConexoes;
public class EmpresaDAO {
public int adiciona(Empresa empresa){
PreparedStatement ps;
int codigoRetorno=0;
try (Connection conn = new FabricaDeConexoes().getConnection()){
} catch (SQLException e){
throw new RuntimeException(e);
}
return 1;
}
}



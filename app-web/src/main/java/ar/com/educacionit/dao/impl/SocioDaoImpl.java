package ar.com.educacionit.dao.impl;


import ar.com.educacionit.domain.Socios;

public class SocioDaoImpl implements SocioSQLCustom {

public Socios create(Socios socio) {
	// mas adelante veremos como conectarnos a la db
	//insertar datos
	String sql = "Insert into socios(nombre, apellido, email, direccion) Values('Carlos','lopez','krloss@gmail.com','av siempre viva 46')";
	System.out.println("Ejecutando sql"+ sql);
	return new Socios(10L,"Carlos","Lopez","krloss@gmail.com","av siempre viva 46",1l);
}
//read by id
public Socios FindById(Long id) {
	String sql ="SELECT * FROM SOCIOS WHERE ID= "+ id;

	return new Socios(id,"Carlos","Lopez","krloss@gmail.com","av siempre viva 46",1l);

	
}
//select *
public Socios[] FindAll() {
	String sql = "select * from socios";
	//varios row 0 > n
	System.out.println("Ejecuctando sql: "+sql);
	Socios socio1 =new Socios(1L,"Carlos","Lopez","krloss@gmail.com","av siempre viva 46",1l);
	Socios socio2 =new Socios(2L,"Carlos 1","Lopez","krloss@gmail.com","av siempre viva 46",1l);
	Socios socio3 =new Socios(2L,"Carlos 1","Lopez","krloss@gmail.com","av siempre viva 46",1l);
	
	return new Socios[] {socio1,socio2,socio3};
	
}
public Socios selectCustom() {
	String sql = "Select nombre, apellido from socios";
		return null;
	}
}


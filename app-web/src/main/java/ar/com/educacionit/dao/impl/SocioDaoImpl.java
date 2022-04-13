package ar.com.educacionit.dao.impl;


import ar.com.educacionit.dao.SociosDao;
import ar.com.educacionit.domain.Socios;

public class SocioDaoImpl extends JDBCDaoBase<Socios> implements SociosDao {

	public SocioDaoImpl() {
		
		super("socios");//es la tabla
	}
	
	/*
public Socios save(Socios socio) {
String sql = "INSERT INTO SOCIOS (nombre, apellido, email, direccion,pais)";
	System.out.println("Ejecutando sql:" + sql);
	return new Socios(10L,"carlos","lopez","krloss@gmail.com","calle siempre viva",1l);
}
//read by id
public Socios getOne(Long id) {
	String sql ="SELECT * FROM SOCIOS WHERE ID= "+ id;
System.out.println("ejecutando sql: "+sql);
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

public void delete(Long id) {
	// TODO Auto-generated method stub
String sql = "DELETE FROM socios WHERE id = "+ id;	
}

public void update(Socios entity) {
String sql = "UPDATE socios "+ "SET direccion = "+ entity.getDireccion() +", APELLIDO = " + entity.getApellido() +
", paises_id =" + entity.getPaisesid() +"WHERE id =" + entity.getId() ;
System.out.println(sql);	
}

/*
public Socios selectCustom() {
	String sql = "Select nombre, apellido from socios";
		return null;
		
		
	}
	
	*/
}


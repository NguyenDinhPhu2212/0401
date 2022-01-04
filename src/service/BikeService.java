package service;

import entity.Bike;
import property.Properties;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BikeService {		
	public Bike getBikeByStationId(int stationId) throws SQLException {
		String sql = "SELECT * FROM bike WHERE typeId='1'";
        Statement stm = Properties.getConnection().createStatement();
        ResultSet res = stm.executeQuery(sql);
		if(res.next()) {
            Bike bike = new Bike();
            bike.setId(res.getInt("id"));
//            bike.setStationId(res.getInt("stationId"));
//            bike.setName(res.getString("name"));
//            bike.setTypeId(res.getInt("typeId"));
            bike.setImage(res.getString("image"));
            bike.setStatus(res.getInt("status"));
        }
		return null;
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.InfoPie.modelDAO;

import br.com.InfoPie.connection.ConnectionFactory;
import br.com.InfoPie.model.beans.Equipamentos;
import br.com.InfoPie.model.beans.OrdemServico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guest-fmw2ws
 */
public class OrdemDeServicoDao {

    private Connection con = null;

    public OrdemDeServicoDao() {
        con = ConnectionFactory.getConnection();
    }

    public List<OrdemServico> findAll() {
        String sql = "select ordemdeservico.tecnico, ordemdeservico.servico, ordemdeservico.situacao,\n"
                + "equipamentos.defeito, equipamentos.marca, equipamentos.tipo\n"
                + "from ordemdeservico \n"
                + "inner join equipamentos on ordemdeservico .id_os = equipamentos.id_os;";
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<OrdemServico> osList = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                OrdemServico os = new OrdemServico();
                os.setTecnico(rs.getString("tecnico"));
                os.setServico(rs.getString("servico"));
                os.setSituacao(rs.getString("situacao"));
                
                Equipamentos eq = new Equipamentos();
                eq.setDefeito(rs.getString("defeito"));
                eq.setMarca(rs.getString("marca"));
                eq.setTipo(rs.getString("tipo"));
                os.setEquipamento(eq);
                osList.add(os);
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e);
        } finally {
            ConnectionFactory.closeConection(con, ps, rs);
        }
        return osList;
    }

}

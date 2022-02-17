package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.ProfissionalDAO;
import modelo.Profissional;
import visao.JanelaPrincipal;

public class ActionPanelListaInternados implements ActionListener{
	
	private JanelaPrincipal jan;
	private Profissional prof;
	private ProfissionalDAO profdao;
	//private Profissional profissional;
	//private ProfissionalDAO profissionalDAO;
	
	public ActionPanelListaInternados(JanelaPrincipal jan, Profissional prof) {
		super();
		this.jan = jan;
		this.prof = prof;
		profdao = new ProfissionalDAO();
		this.jan.getItemAdmissao().addActionListener(this);
		this.jan.getBotaoCancelarAdmissao().addActionListener(this);
		this.jan.getBotaoSalvarAdmissao().addActionListener(this);
		//this.profissional = prof;
		//this.profissionalDAO =  profDao;
	}

	@Override
	public void actionPerformed(ActionEvent e1) {
		
		switch (e1.getActionCommand()) {
		case "Lista de Internados":
			jan.setTitle("Lista de Internados");
			jan.getPanelListaInternados().setVisible(true);
			jan.getPanel().setVisible(false);
			jan.getPanelAdmissao().setVisible(false);
			jan.getPanelAlta().setVisible(false);
			jan.getPanelMedicamentos().setVisible(false);
			jan.getPanelPrescrever().setVisible(false);
			break;
		case "Cancelar":
			jan.limpaTelaAdmissao();
			break;
		case "Salvar":
			System.out.println("funcionou");
			
		//case "Salvar":
			//profissional.setCpfAdmissao(jan.getFieldCpfAdmissao().getText());
			
		
	}

		
} 

}

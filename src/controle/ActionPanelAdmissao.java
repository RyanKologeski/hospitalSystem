package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import dao.ProfissionalDAO;
import modelo.Profissional;
import visao.JanelaPrincipal;


public class ActionPanelAdmissao implements ActionListener{
	
		private JanelaPrincipal jan;
		private Profissional prof;
		private ProfissionalDAO profdao;
		//private Profissional profissional;
		//private ProfissionalDAO profissionalDAO;
		
		public ActionPanelAdmissao(JanelaPrincipal jan, Profissional prof) {
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
			case "Admissão":
				jan.getPanelAdmissao().setVisible(true);
				jan.getPanel().setVisible(false);
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

		
		
		



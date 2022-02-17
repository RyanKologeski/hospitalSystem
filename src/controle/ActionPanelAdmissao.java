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
				jan.setTitle("Admissão");
				jan.getPanelAdmissao().setVisible(true);
				jan.getPanel().setVisible(false);
				jan.getPanelAlta().setVisible(false);
				jan.getPanelListaInternados().setVisible(false);
				jan.getPanelMedicamentos().setVisible(false);
				jan.getPanelPrescrever().setVisible(false);
				break;
			case "Cancelar":
				jan.limpaTelaAdmissao();
				break;
			case "Salvar":
				
				prof.setNome(jan.getFieldNomeAdmissao().getText());
				prof.setCpf(jan.getFieldCpfAdmissao().getText());
				prof.setDataNasc(jan.getFieldDataNascAdmissao().getText());
				
				if(jan.getCheckBoxDipironaAlergia().isSelected()) {
					
				}
				
				if(!Profissional.isCPF(prof.getCpf())) 
				{
					System.out.println("CPF inválido!");
				}
				else  
				{
					System.out.println("CPF válido\n");
					System.out.println(prof);
				}
				System.out.println("funcionou");
				
			//case "Salvar":
				//profissional.setCpfAdmissao(jan.getFieldCpfAdmissao().getText());
				
			
		}

			
} 
}

		
		
		



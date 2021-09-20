#language: pt
#encoding: utf-8

@cadastrarUsuario
Funcionalidade: Cadastrar Usuario

@cadastro
Cenario: Cadastrar usuario
	Quando eu acionar a aba admin
	E acionar o botao add
	E informar no campo employer name "Aaliyah Haq"
	E informar no campo username "Aaliyah Haq"
	E informar no campo password "12345678"
	E informar no campo confirmar password "12345678"
	E acionar o botao salvar
	Entao o sistema cadastra o usuario. "Aaliyah Haq"

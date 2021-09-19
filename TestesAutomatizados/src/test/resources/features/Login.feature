#language: pt
#encoding: utf-8

@login
Funcionalidade: Login

Cenario: Usuário inválido
	Quando eu informar o usuario "Ad"
	E informar a senha "ad"
	E clicar no botao login
	Entao o sistema exibe a mensagem de usuario invalido.
	
	@loginSucesso
	Cenario: Realizar login
	Quando eu informar o usuario "Admin"
	E informar a senha "admin123"
	E clicar no botao login
	Entao o sistema exibe o usuario autenticado.
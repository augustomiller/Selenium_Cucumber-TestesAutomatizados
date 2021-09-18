#language: pt
#encoding: utf-8

@login
Funcionalidade: Acessar Sistema

Contexto: Usuário autenticado.
	Dado que eu estou acessando o sistema
	Quando eu informar usuário
	E informar a senha
	Entao o sistema apresenta o usuário logado

@informarCampo
Cenario: Cenario 1
	Quando eu cadastrar um usuario

Cenario: Cenario 2
	Quando eu editar um usuario
	
Cenario: Cenario 3
	Quando eu excluir um usuario
	
Cenario: Cenario 4
	Quando eu desabilitar um usuario
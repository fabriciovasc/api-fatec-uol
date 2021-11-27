# Aprendizado por Projeto Integrador
Projeto em desenvolvimento pelos alunos da Equipe 2 - Turma 6º Semestre do curso Análise e Desenvolvimento de Sistemas da FATEC - Faculdade de Tecnologia de São José dos Campos.

## 📌 Desafio
O número de cibercrimes aumentou no Brasil durante a pandemia de covid-19, com mais pessoas conectadas à internet. Os golpes virtuais já existiam, mas pode-se dizer que os criminosos atualizaram as suas táticas de atuação. As fraudes na internet prosseguem preocupando a população em torno de todo mundo, principalmente quando o contexto abordado é sobre compras ou vendas, porque envolvem dados sensíveis pessoais envolvendo instituições financeiras o que causa extrema insegurança ao realizar esses procedimentos via internet.
Sendo o segundo crime financeiro mais reportado no mundo, acima de propina, corrupção e crimes cibernéticos, fraudes no processo de compras e pagamentos é uma preocupação constante do UOL.
Foi observado que um bom processo de análise de fraudes nos auxilia a desenvolver soluções eficientes que visam o aumento de receita e melhoram a reputação da marca.
Em parceria com a Fatec São José dos Campos acreditamos que alunos do 6º ADS podem contribuir com o UOL em alternativas disruptivas que mitigam o risco de fraude cadastral.

___

## 🏁 Projeto
A proposta de solução apresentada será mapear usuários falsos e duplicados da plataforma BOL.com.br através da identificação única.

___

## 💹 Planejamento
- [x] Kick-off - 16/08 à 22/08 - ✅
- [x] Sprint 1 - 30/08 à 19/09 - ✅
- [x] Sprint 2 - 20/09 à 10/10 - ✅ 
- [x] Sprint 3 - 18/10 à 07/11 - ✅
- [x] Sprint 4 - 08/11 à 28/11 - ✅
- [ ] Apresentação final - 29/11 à 05/12

## 📃 Product Backlog
Acesse o link para visualizar:
 - [Backlog descritivo](/documentacao/backlog.rst)

 ___

## 👨‍💻 Desenvolvimento
Clonar esse repositório com os submódulos dos repositórios (front-end e back-end) atualizados
```
git clone --recursive git@github.com:fabsvas/api-fatec-uol.git
git submodule update --remote
cd fatec-uol-backend
cd ..
cd fatec-uol-frontend
cd ..
cd fatec-uol-user-recognition
```
Clonar somente o repositório do back-end
> Acesse o link para visualizar: [fatec-uol-backend](https://github.com/fabsvas/fatec-uol-backend/)

Clonar somente o repositório do front-end
> Acesso o link para visualizar: [fatec-uol-frontend](https://github.com/fabsvas/fatec-uol-backend/)

Clonar somente o repositório do serviço de machine learning
> Acesso o link para visualizar: [fatec-uol-user-recognition](https://github.com/fabsvas/fatec-uol-user-recognition/)

___

## 🛠 Tecnologias
O projeto está sendo estruturado com as seguintes tecnologias:

### Back-end
- Spring Boot;
- MySQL;
- Gitpod.io.

## Machine Learning
- KNN + Manhattan Distance
- Flask

### Front-end
- Vue.js;
- Axios;
- VueX.

___

## 🏢 Time

| Aluno(a)         | Função           | GitHub                                                         | LinkedIn                                              |
| ---------------- | ---------------- | -------------------------------------------------------------- | ----------------------------------------------------- |
|__Fabrício Vasconcellos__  | *Product Owner*  | [![](https://bit.ly/3f9Xo0P)](https://github.com/fabsvas)| [![](https://bit.ly/2P1ZogM)](https://www.linkedin.com/in/fabsvas/) |
|__Rafael Ribeiro__| *Scrum Master* | [![](https://bit.ly/3f9Xo0P)](https://github.com/RafaRibeiroRodri) | [![](https://bit.ly/2P1ZogM)](https://www.linkedin.com/in/rafael-ribeiro-31880019b/) |
|__Vitor Amorim__  | *Developer Team* | [![](https://bit.ly/3f9Xo0P)](https://github.com/MaguinhoD)  | [![](https://bit.ly/2P1ZogM)](https://www.linkedin.com/in/vitor-amorim-07474793/) |
|__Jonatas dos Reis__ | *Developer Team* | [![](https://bit.ly/3f9Xo0P)](https://github.com/JonnReis)   | [![](https://bit.ly/2P1ZogM)](https://www.linkedin.com/in/jonatas-reis-a15052148/) |
|__Samuel Xavier__| *Developer Team* | [![](https://bit.ly/3f9Xo0P)](https://github.com/krusader1982) | [![](https://bit.ly/2P1ZogM)](https://www.linkedin.com/in/samuel-dias-xavier-2984a0106/) |
|__Douglas Henrique__| *Developer Team* | [![](https://bit.ly/3f9Xo0P)](https://github.com/DhBarboza) | [![](https://bit.ly/2P1ZogM)](https://www.linkedin.com/in/developer-dhbarboza/) |

___

## :open_file_folder: Sprints
Todos os entregáveis e planejamento para as sprints serão descritos abaixo:

### :memo: Sprint 1
> Status: Concluído ✅

> Objetivo: Estruturar as entidades para comparação de hashes processados pela view e identificar um único usuário.

> Documentações geradas:

- Gestão e Governança de Tecnologia da Informação
   - [Design Thinking](/documentacao/SPRINT_1/GGTI/Design-Thinking.pdf)
   - [EAP](/documentacao/SPRINT_1/GGTI/EAP.pdf)

- Gestão de Projetos
   - [Cronograma](/documentacao/SPRINT_1/GP/Gerenciamento_Cronograma_UOL.pdf)
   - [Custos](/documentacao/SPRINT_1/GP/Gerenciamento_Custos_UOL.pdf)
   - [Escopo](/documentacao/SPRINT_1/GP/Gerenciamento_Escopo_UOL.pdf)

- [Apresentação](/documentacao/SPRINT_1/Apresentação.pptx)
- [Vídeo Demonstrativo](/documentacao/SPRINT_1/Vídeo_Apresentação.mp4)

___

### :memo: Sprint 2
> Status: Concluído ✅

> Objetivo: Processar um hash único com base na renderização da GPU do usuário, aproveitando outras informações nativas do navegador como forma de estudo para implantação de um IA.

> Documentações geradas:

- Gestão e Governança de Tecnologia da Informação
	- [Design Thinking](/documentacao/SPRINT_2/GGTI/Design-Thinking.pdf)
	- [PETI/BSC](/documentacao/SPRINT_2/GGTI/Planejamento-Estrategico-TI.pdf)

- Gestão de Projetos
	- [Cronograma](/documentacao/SPRINT_2/GP/Gerenciamento_Cronograma.pdf)
	- [Custo](/documentacao/SPRINT_2/GP/Gerenciamento_Custo.pdf)
	- [Escopo](/documentacao/SPRINT_2/GP/Gerenciamento_Escopo.jpeg)
	- [Qualidade](/documentacao/SPRINT_2/GP/Gerenciamento_Qualidade.xlsx)
___

### :memo: Sprint 3
> Status: Concluído ✅

> Objetivo: Coleta de informações comportamentais do usuário e análise das estruturas das vértices com as novas informações coletadas que serão utilizados na inteligência artificial com análise de grafos para modelar informações e identificar usuários únicos.

> Documentações geradas:

- Gestão e Governança de Tecnologia da Informação
	- [BSC](/documentacao/SPRINT_3/GGTI/BSC_TI_Sprint3.jpeg)
	- [Catálogo de Serviços](/documentacao/SPRINT_3/GGTI/Catalogo-Servicos-Sprint3.xlsx)
	- [Design Thinking](/documentacao/SPRINT_3/GGTI/Design-Thinking-Sprint3.pdf)
	- [Portifólio de Serviços](/documentacao/SPRINT_3/GGTI/Portifolio-Servico-Sprint3.pdf)

- Gestão de Projetos
	- [Gerenciamento de Qualidade](https://github.com/fabsvas/api-fatec-uol/blob/master/documentacao/SPRINT_3/GP/QUALIDADE%20S3.pdf)
	- [Gerenciamento de Comunicação](https://github.com/fabsvas/api-fatec-uol/blob/master/documentacao/SPRINT_3/GP/Gerenc.%20da%20Comunica%C3%A7%C3%A3o%20s3.xlsx)
	- [Gerenciamento de Risco](https://github.com/fabsvas/api-fatec-uol/blob/master/documentacao/SPRINT_3/GP/risco%20s3.pdf)
	- [Gerenciamento de RH](https://github.com/fabsvas/api-fatec-uol/blob/master/documentacao/SPRINT_3/GP/Matriz%20RACI%20s3.xlsx)
___

### :memo: Sprint 4
> Status: Concluído ✅

> Objetivo: Implementação de inteligência artificial utilizando o método Manhattan Distance juntamente com o algoritmo de vizinhos próximos (KNN). Disponibilizar um serviço que consuma as previsões da IA retornando possíveis usuários duplicados.

> Documentações geradas:

- Gestão e Governança de Tecnologia da Informação
	- [Fresh Desk](https://intelitec.freshdesk.com/support/home)
	- [Portfólio em Excel](/documentacao/SPRINT_4/GGTI/PortfólioServiços.xlsx)

- Gestão de Projetos
	- [Project Model Canvas](/documentacao/SPRINT_4/GP/ProjectModelCanvas.pdf)



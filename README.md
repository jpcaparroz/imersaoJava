# Imersão Java
Imersão Java - Alura 💻
![banner-alura-test](https://user-images.githubusercontent.com/72393735/181022735-1fb6ed5c-b7cd-4ea6-9e4e-bdf03336719c.png)
<p align="center">
<img src="https://img.shields.io/badge/Linguagem-Java-critical?style=flat&logo="/> <img src="https://img.shields.io/badge/Framework-Spring-brightgreen??style=flat&logo=spring"/> <img src="https://img.shields.io/badge/BD-MongoDB-green?style=flat&logo=mongodb?link=https://spring.io"/> 
</p>

## 📌 Índice
* [Resumo 📖](##Projeto-|-Aulas)
* [Código ⌨](##Código)
* [Selos ✒](##Selos)
* [Resultados 📈](##Resultados)
* [Tecnologias 💻](##Tecnologias)

## 📖 Projeto | Aulas
Nesta Imersão da Alura o foco foi todo em Java, usando o Spring para conexão com o MongoDB. 
- Utilizamos uma API pública do IMDb para consumir um JSON de uma lista de 250 melhores filmes || Parseando esse JSON utilizando REGEX e jogando-o dentro de uma `List` dentro de um `Map` 
> Nesse primeiro momento o código ainda bem cru e sem muita organização, sendo feito tudo no App.java

- Com o JSON transformado em lista, obtemos algumas informações importantes para geração do Sticker, como: `Poster (URL de imagem)` `Nome do Filme` `Nota do Filme`
|| Assim transformando e salvando esse poster em uma nova imagem para ser salva como .png 
> Nessa parte já realizei a criação dos `Selos` para ser colocado em cima da imagem do poster, dependendo da nota obtida do JSON ele coloca um selo diferente

- Código organizado e refatorado para a criação da nossa própria `API` utilizando `Spring` e upando ao `MongoDB` uma coleção com os seguintes atributos: `title` `image` `ranking` 

- E a última etapa foi colocar em Nuvem a API para poder acessar de qualquer lugar sem ser localmente. Utilizando o `Heroku` upamos nossa API.


#### Aulas

- [x]  1 -> Consumindo uma API com Java ✔ [^1]
- [x]  2 -> Gerando figurinhas em .png ✔ [^2]
- [x]  3 -> Refatorando e programação Orientada a Objetos ✔ [^3]
- [x]  4 -> Criando API com o Spring ✔ [^4]
- [x]  5 -> Upando API no cloud (Heroku) ✔ [^5]

[^1]: <a target="_blank" href="https://github.com/jpcaparroz/imersaoJava/commit/4292c26afdc0d67d34c4cd05423e5bab9719dbfb"> `commit #4292c26` </a>
[^2]: <a target="_blank" href="https://github.com/jpcaparroz/imersaoJava/commit/420b494ff2017715f70277095ba1e89a5e57795f"> `commit #420b494` </a>
[^3]: <a target="_blank" href="https://github.com/jpcaparroz/imersaoJava/commit/2e5d0071ecbf065958109db8609525841dddd01e"> `commit #2e5d007` </a>
[^4]: <a target="_blank" href="https://github.com/jpcaparroz/imersaoJava/commit/08329f2d817831f37aca1f0f3d4e0c94b89fcaa9"> `commit #08329f2` </a>
[^5]: <a target="_blank" href="https://github.com/jpcaparroz/imersaoJava/commit/529a669c26a3127b615fab68d6cb4c5332b9c17b"> `commit #529a669` </a>

## ⌨ Código 

Breve print's do projeto dentro do VSCODE 
> O código foi escrito baseando-se em todas as aulas, com particularidades pessoais e de fácil entendimento 😁

<br>
<img src="https://img.shields.io/badge/PRINT-App.java-red"/> 

<img  width="65%" height="60%" alt="App.java" src="https://user-images.githubusercontent.com/72393735/181037005-88fbbdc0-6557-4ddc-a861-2db89a425a7d.png"/>

<img src="https://img.shields.io/badge/PRINT-Import classe App-red"/><br>

<img  width="45%" height="60%" alt="Import" src="https://user-images.githubusercontent.com/72393735/181040219-aaf503a5-675e-4d1b-b67b-c4f6a112797c.png"/> <br>

Projeto organizado e utilizando POO, assim o código ficando limpo e bem **sucinto** 🥳

## ✒ Selos
Os 'Selos de Qualidade' foram feitos utilizando o photoshop e exportados em .png para assim dar um efeito bem bacana nas figurinhas.

><img width="30%" src="https://user-images.githubusercontent.com/72393735/181043952-a0388d45-2fda-4931-8c89-02b63fe9fc76.png"/> <img width="30%" src="https://user-images.githubusercontent.com/72393735/181044401-14aba6a9-8e26-4c58-b66a-af58ded90e6b.png"/> <img width="30%" src="https://user-images.githubusercontent.com/72393735/181044389-18dfe19e-8d30-44db-abf1-528890e636fb.png"/>

| Selo  |  Lógica  |
| ------------------- | ------------------- |
|  Selo Aprovado 🟢 |  _nota_ >= 9 |
|  Selo Quase 🟡 |  _nota_ >= 8.4 |
|  Selo Jamais 🔴 |  _nota_ < 8.4 |

## 📈 Resultados

## 💻 Tecnologias


</head>

<body>
	<article id="4a674d65-78e1-41d7-9177-43d19b098d20" class="page sans">
		<header><img src="https://www.notion.so/images/page-cover/gradients_8.png" style="object-position:center 70%;display: block;
	object-fit: cover;
	width: 100%;
	max-height: 30vh;
	height: 10vh;" />
			<div style="font-size: 3rem;
	margin-bottom: 1rem;
	margin-top: -0.72em;
	margin-left: 0.07em;
">
				<img class="icon" src="https://www.notion.so/icons/phone_gray.svg" style="position: absolute; width: 200px; transform: translateY(-3rem);" />
			</div>
			<h1 class="page-title">Diseño del Sistema</h1>
			<p class="page-description"></p>
		</header>
		<div class="page-body">
			<p id="e5e16371-d5dd-495a-81cb-be55050c5c20" class="">
			</p>
			<h1 style="letter-spacing: -0.01em;
line-height: 1.2;
font-weight: 600;
margin-bottom: 0;" id="4449147b-d2e2-487d-ba82-c9cf27c7849d" class="">Visión General Del Sistema</h1>
			<hr id="c4ee16d3-5e0d-4b06-99da-262e0049ec7a" />
			<ul id="7848de79-16f2-4f9b-9d8b-555b9195e46f" class="bulleted-list">
				<li style="list-style-type:disc">Propósito: El sistema tiene como objetivo permitir a los usuarios
					Gestionar <strong><strong>Artículos </strong></strong>De <strong><strong>Interés </strong></strong>y
					Además Crear sus propios Artículos.</li>
			</ul>
			<ul id="c618830f-4ef1-42a6-af64-5dc243dde2b8" class="bulleted-list">
				<li style="list-style-type:disc"><strong>Características </strong>principales:<ul
						id="eba8d110-a4e9-4acf-8e24-339d1f3e3a57" class="bulleted-list">
						<li style="list-style-type:circle">Ver <strong><strong>Artículos </strong></strong>de
							<strong><strong>Interés</strong></strong>: Permite a los Usuarios Buscar y filtrar artículos
							Creados por Otros Usuarios.</li>
					</ul>
					<ul id="e30d44d2-6835-40d4-90f1-66cb0c49c947" class="bulleted-list">
						<li style="list-style-type:circle">Crear <strong><strong>Artículo</strong></strong> Propios:
							Permite a los Usuarios Generar <strong><strong>Artículos </strong></strong>para que puedan
							ser compartidos con los otros usuarios.</li>
					</ul>
					<ul id="0e7818a3-35cd-4e4f-8c01-77ab7e314c0d" class="bulleted-list">
						<li style="list-style-type:circle">Inicio de <strong><strong>Sesión</strong></strong>: Permite a
							los usuarios crear una cuenta para manejar sus <strong><strong>Artículos</strong></strong>.
						</li>
					</ul>
				</li>
			</ul>
			<h1 id="945149a2-3f29-4d48-9f71-096d8cb1517e" class="">Arquitectura Del Sistema</h1>
			<hr id="a3cb18ce-04a2-43e6-94c0-f8e9e43bc797" />
			<ul id="588a75bc-36ec-4e75-9321-3c5e772bec67" class="bulleted-list">
				<li style="list-style-type:disc">Capas del Sistema:<ul id="285138db-d325-495f-824b-5e384bb7553f"
						class="bulleted-list">
						<li style="list-style-type:circle">Capa De Presentación: Se encarga de la Interfaz grafica e
							interacción con el usuario.</li>
					</ul>
					<ul id="fbfa2c24-d214-45bb-a1a1-4160c9ce720c" class="bulleted-list">
						<li style="list-style-type:circle">Capa de Frontend: Se encuentra la lógica para brindar
							interacción de la interfaz grafica con el servidor.</li>
					</ul>
					<ul id="1fb212d4-c5be-4afc-b54d-e7560488a372" class="bulleted-list">
						<li style="list-style-type:circle">Capa de Backend: Se encuentra la lógica para administrar la
							base de datos así como registrar los artículos y permitir el registro e inicio de
							s<strong><strong>esión </strong></strong>del usuario. (<a href="https://github.com/JhonattanAron/adapLeap">Repositorio Backend</a>) </li>	
					</ul>
					<ul id="982d6be2-4422-4d03-addf-ba14a211de15" class="bulleted-list">
						<li style="list-style-type:circle">Base de datos: Se encuentra la información del sistema.</li>
					</ul>
				</li>
			</ul>
			<ul id="0fd95453-cd50-4914-89b0-31a01359477f" class="bulleted-list">
				<li style="list-style-type:disc">Tecnologías Utilizada:<ul id="8527a190-e4f5-4e4c-8cb2-b6f8b5722f95"
						class="bulleted-list">
						<li style="list-style-type:circle">Android Estudio: IDE para desarrollo de aplicaciones en
							Android.</li>
					</ul>
					<ul id="c85c67ed-bb11-452f-b56e-07d41f7a67c1" class="bulleted-list">
						<li style="list-style-type:circle"><strong><strong>IntelliJ IDEA: IntelliJ IDEA es un entorno de
									desarrollo integrado para el desarrollo de programas informáticos.</strong></strong>
						</li>
					</ul>
					<ul id="83d427cc-1c43-482c-a1b5-637f39744a69" class="bulleted-list">
						<li style="list-style-type:circle">Kotlin: Utilizado para desarrollar la lógica del Frontend y
							solicitudes al servidor.</li>
					</ul>
					<ul id="9b1919c7-2cd9-49e6-b257-fc13363e3690" class="bulleted-list">
						<li style="list-style-type:circle">Java: Utilizado para desarrollar la lógica del Backend para
							el servicio REST.</li>
					</ul>
					<ul id="63a72abf-eaed-4323-9bd4-8f6e171a44ad" class="bulleted-list">
						<li style="list-style-type:circle">MariaDB: MariaDB es un sistema de gestión de bases de datos
							derivado de MySQL con licencia GPL.</li>
					</ul>
					<ul id="f27bd4d2-4230-4d61-909a-57baa5a427ac" class="bulleted-list">
						<li style="list-style-type:circle">Spring Boot: Spring Boot Extensión es la solución de
							convención sobre configuración de Spring para crear aplicaciones Spring de nivel de
							producción con cantidades mínimas de configuración.</li>
					</ul>
				</li>
			</ul>
			<h1 id="6ff103a3-afba-4f78-a6c3-1b29f29d0131" class="">Tareas</h1>
			<hr id="8aeb8c33-235f-45b5-b248-ca19a7204e44" />
			<ul id="5b577901-ff18-44ef-9cf7-12b400302250" class="to-do-list">
				<li>
					<div class="checkbox checkbox-off"></div> <span class="to-do-children-unchecked">Frontend</span>
					<div class="indented">
						<ul id="8aead13d-8674-46a0-98de-53ee8175858f" class="to-do-list">
							<li>
								<div class="checkbox checkbox-on"></div> <span class="to-do-children-checked">UI Inicio
									De <strong><strong>Sesión</strong></strong></span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="1787a719-6443-49d6-820b-1c56c83f600b" class="to-do-list">
							<li>
								<div class="checkbox checkbox-on"></div> <span class="to-do-children-checked">Lógica de
									Inicio de sesión.</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="a96100c5-b3aa-4946-8b0a-df6ba14cbb18" class="to-do-list">
							<li>
								<div class="checkbox checkbox-on"></div> <span class="to-do-children-checked">UI
									Registro</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="0ff8a584-efaa-4821-8c13-6b4820947c63" class="to-do-list">
							<li>
								<div class="checkbox checkbox-on"></div> <span class="to-do-children-checked">Lógica de
									registro.</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="e65f9608-d44d-488c-b587-4d1c76ada8fd" class="to-do-list">
							<li>
								<div class="checkbox checkbox-off"></div> <span class="to-do-children-unchecked">Lógica
									de La Pagina Principal </span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="5e06e4cd-71ab-49aa-966f-6a88a6eaf59b" class="to-do-list">
							<li>
								<div class="checkbox checkbox-off"></div> <span class="to-do-children-unchecked">UI Crud
									de <strong><strong>Artículos</strong></strong></span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="d76b1f63-52b5-4675-bd0a-62b6077dff5f" class="to-do-list">
							<li>
								<div class="checkbox checkbox-off"></div> <span class="to-do-children-unchecked">UI CRUD
									ADD</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="cbdd62d4-6ce2-4fcd-8fdb-2db53461540e" class="to-do-list">
							<li>
								<div class="checkbox checkbox-off"></div> <span class="to-do-children-unchecked">UI CRUD
									UPDATE</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="05491ecd-7fe1-4f87-81d8-e1b60e06b6e3" class="to-do-list">
							<li>
								<div class="checkbox checkbox-off"></div> <span class="to-do-children-unchecked">Lógica
									del Crud.</span>
								<div class="indented"></div>
							</li>
						</ul>
					</div>
				</li>
			</ul>
			<ul id="67a1eb73-fa63-4f82-9158-a27912d50b21" class="to-do-list">
				<li>
					<div class="checkbox checkbox-off"></div> <span class="to-do-children-unchecked">Backend</span>
					<div class="indented">
						<ul id="a7496687-c1ed-480e-b182-8515a199a895" class="to-do-list">
							<li>
								<div class="checkbox checkbox-on"></div> <span class="to-do-children-checked">Servicio
									REST de artículos.</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="b32dae09-804f-416d-adb4-7587d8ec5eeb" class="to-do-list">
							<li>
								<div class="checkbox checkbox-on"></div> <span class="to-do-children-checked">Servicio
									ENDPOINT de registro usuarios.</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="47aae22b-2e2e-4a8c-b6c2-e3278ae96707" class="to-do-list">
							<li>
								<div class="checkbox checkbox-on"></div> <span class="to-do-children-checked">Servicio
									ENDPOINT de registro de <strong><strong>Artículos</strong></strong>.</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="f16b57b1-997b-44cd-a3ff-c8c6b1a1549f" class="to-do-list">
							<li>
								<div class="checkbox checkbox-off"></div> <span
									class="to-do-children-unchecked">Servicio ENDPOINT de delete Artículos.</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="b6db98df-9087-4c3b-af3b-6ef01b49a55d" class="to-do-list">
							<li>
								<div class="checkbox checkbox-off"></div> <span
									class="to-do-children-unchecked">Servicio ENDPOINT de update Artículos.</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="2fa629ce-0dde-42b5-893d-1db5f1053b31" class="to-do-list">
							<li>
								<div class="checkbox checkbox-on"></div> <span class="to-do-children-checked">Servicio
									ENDPOINT de inicio de <strong><strong>Sesión.</strong></strong></span>
								<div class="indented"></div>
							</li>
						</ul>
					</div>
				</li>
			</ul>
		</div>
	</article>
</body>

</html>

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
			<h1 class="page-title">System Design</h1>
			<p class="page-description"></p>
		</header>
		<div class="page-body">
			<p id="e5e16371-d5dd-495a-81cb-be55050c5c20" class="">
			</p>
			<h1 style="letter-spacing: -0.01em;
line-height: 1.2;
font-weight: 600;
margin-bottom: 0;" id="4449147b-d2e2-487d-ba82-c9cf27c7849d" class="">System Overview</h1>
			<hr id="c4ee16d3-5e0d-4b06-99da-262e0049ec7a" />
			<ul id="7848de79-16f2-4f9b-9d8b-555b9195e46f" class="bulleted-list">
				<li style="list-style-type:disc">Purpose: The system aims to allow users to manage interesting articles and also create their own articles.</li>
			</ul>
			<ul id="c618830f-4ef1-42a6-af64-5dc243dde2b8" class="bulleted-list">
				<li style="list-style-type:disc">Key Features:<ul
						id="eba8d110-a4e9-4acf-8e24-339d1f3e3a57" class="bulleted-list">
						<li style="list-style-type:circle">View Interesting Articles: Allows users to search and filter articles created by other users.</li>
					</ul>
					<ul id="e30d44d2-6835-40d4-90f1-66cb0c49c947" class="bulleted-list">
						<li style="list-style-type:circle">Create Own Article: Enables users to generate articles that can be shared with other users.</li>
					</ul>
					<ul id="0e7818a3-35cd-4e4f-8c01-77ab7e314c0d" class="bulleted-list">
						<li style="list-style-type:circle">Login: Allows users to create an account to manage their articles.</li>
					</ul>
				</li>
			</ul>
			<h1 id="945149a2-3f29-4d48-9f71-096d8cb1517e" class="">System Architecture</h1>
			<hr id="a3cb18ce-04a2-43e6-94c0-f8e9e43bc797" />
			<ul id="588a75bc-36ec-4e75-9321-3c5e772bec67" class="bulleted-list">
				<li style="list-style-type:disc">System Layers:<ul id="285138db-d325-495f-824b-5e384bb7553f"
						class="bulleted-list">
						<li style="list-style-type:circle">Presentation Layer: Handles the graphical interface and user interaction.</li>
					</ul>
					<ul id="fbfa2c24-d214-45bb-a1a1-4160c9ce720c" class="bulleted-list">
						<li style="list-style-type:circle">Frontend Layer: Contains the logic for providing interaction between the graphical interface and the server.</li>
					</ul>
					<ul id="1fb212d4-c5be-4afc-b54d-e7560488a372" class="bulleted-list">
						<li style="list-style-type:circle">Backend Layer: Contains the logic for managing the database, registering articles, and enabling user registration and login. (Backend Repository)</li>	
					</ul>
					<ul id="982d6be2-4422-4d03-addf-ba14a211de15" class="bulleted-list">
						<li style="list-style-type:circle">Database: Contains the system's information.</li>
					</ul>
				</li>
			</ul>
			<ul id="0fd95453-cd50-4914-89b0-31a01359477f" class="bulleted-list">
				<li style="list-style-type:disc">Technologies Used:<ul id="8527a190-e4f5-4e4c-8cb2-b6f8b5722f95"
						class="bulleted-list">
						<li style="list-style-type:circle">Android Studio: IDE for Android application development.</li>
					</ul>
					<ul id="c85c67ed-bb11-452f-b56e-07d41f7a67c1" class="bulleted-list">
						<li style="list-style-type:circle">IntelliJ IDEA: IntelliJ IDEA is an integrated development environment for software development.</li>
					</ul>
					<ul id="83d427cc-1c43-482c-a1b5-637f39744a69" class="bulleted-list">
						<li style="list-style-type:circle">Kotlin: Used to develop frontend logic and make requests to the server.</li>
					</ul>
					<ul id="9b1919c7-2cd9-49e6-b257-fc13363e3690" class="bulleted-list">
						<li style="list-style-type:circle">Java: Used to develop backend logic for the REST service.</li>
					</ul>
					<ul id="63a72abf-eaed-4323-9bd4-8f6e171a44ad" class="bulleted-list">
						<li style="list-style-type:circle">MariaDB: MariaDB is a database management system derived from MySQL and licensed under the GPL.</li>
					</ul>
					<ul id="f27bd4d2-4230-4d61-909a-57baa5a427ac" class="bulleted-list">
						<li style="list-style-type:circle">Spring Boot: Spring Boot is the Spring framework's convention-over-configuration solution for creating production-grade Spring applications with minimal configuration.</li>
					</ul>
				</li>
			</ul>
			<h1 id="6ff103a3-afba-4f78-a6c3-1b29f29d0131" class="">Tasks</h1>
			<hr id="8aeb8c33-235f-45b5-b248-ca19a7204e44" />
			<ul id="5b577901-ff18-44ef-9cf7-12b400302250" class="to-do-list">
				<li>
					<div class="checkbox checkbox-off"></div> <span class="to-do-children-unchecked">Frontend</span>
					<div class="indented">
						<ul id="8aead13d-8674-46a0-98de-53ee8175858f" class="to-do-list">
							<li>
								<div class="checkbox checkbox-on"></div> <span class="to-do-children-checked">UI Login</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="1787a719-6443-49d6-820b-1c56c83f600b" class="to-do-list">
							<li>
								<div class="checkbox checkbox-on"></div> <span class="to-do-children-checked">Login Logic.</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="a96100c5-b3aa-4946-8b0a-df6ba14cbb18" class="to-do-list">
							<li>
								<div class="checkbox checkbox-on"></div> <span class="to-do-children-checked">UI Registration</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="0ff8a584-efaa-4821-8c13-6b4820947c63" class="to-do-list">
							<li>
								<div class="checkbox checkbox-on"></div> <span class="to-do-children-checked">Registration Logic.</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="e65f9608-d44d-488c-b587-4d1c76ada8fd" class="to-do-list">
							<li>
								<div class="checkbox checkbox-off"></div> <span class="to-do-children-unchecked">Homepage Logic</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="5e06e4cd-71ab-49aa-966f-6a88a6eaf59b" class="to-do-list">
							<li>
								<div class="checkbox checkbox-off"></div> <span class="to-do-children-unchecked">UI CRUD Articles</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="d76b1f63-52b5-4675-bd0a-62b6077dff5f" class="to-do-list">
							<li>
								<div class="checkbox checkbox-off"></div> <span class="to-do-children-unchecked">UI CRUD ADD</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="cbdd62d4-6ce2-4fcd-8fdb-2db53461540e" class="to-do-list">
							<li>
								<div class="checkbox checkbox-off"></div> <span class="to-do-children-unchecked">UI CRUD UPDATE</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="05491ecd-7fe1-4f87-81d8-e1b60e06b6e3" class="to-do-list">
							<li>
								<div class="checkbox checkbox-off"></div> <span class="to-do-children-unchecked">CRUD Logic.</span>
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
								<div class="checkbox checkbox-on"></div> <span class="to-do-children-checked">Article REST Service.</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="b32dae09-804f-416d-adb4-7587d8ec5eeb" class="to-do-list">
							<li>
								<div class="checkbox checkbox-on"></div> <span class="to-do-children-checked">User Registration ENDPOINT Service.</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="47aae22b-2e2e-4a8c-b6c2-e3278ae96707" class="to-do-list">
							<li>
								<div class="checkbox checkbox-on"></div> <span class="to-do-children-checked">Article Registration ENDPOINT Service.</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="f16b57b1-997b-44cd-a3ff-c8c6b1a1549f" class="to-do-list">
							<li>
								<div class="checkbox checkbox-off"></div> <span
									class="to-do-children-unchecked">Delete Article ENDPOINT Service.</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="b6db98df-9087-4c3b-af3b-6ef01b49a55d" class="to-do-list">
							<li>
								<div class="checkbox checkbox-off"></div> <span
									class="to-do-children-unchecked">Update Article ENDPOINT Service.</span>
								<div class="indented"></div>
							</li>
						</ul>
						<ul id="2fa629ce-0dde-42b5-893d-1db5f1053b31" class="to-do-list">
								<div class="checkbox checkbox-on"></div> <span class="to-do-children-checked">Session Login ENDPOINT Service.</span>
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

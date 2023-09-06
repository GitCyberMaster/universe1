<div style="text-align: center;">

![Universe](./_images/logo.png)
</div>

Прізвище!

## Вступ
Цей проект є програмою на основі Java, створеною за допомогою фреймворку Javalin. Його основна мета — надати користувачам платформу для створення власного світу, ділячись своїми думками, досвідом і враженнями зі своєю аудиторією. За допомогою цього блогу користувачі можуть ділитися своїми ідеями зі світом і спілкуватися з іншими, хто має подібні інтереси.

## Features
* **Автентифікація користувача:** користувачі можуть [зареєструватися](./_images/sign-up.png), [увійти](./_images/sign-in.png) і [вийти](./_images/sign -out.png) безпечно.
* **Password recovery:** користувачі можуть [скинути свій пароль](./_images/reset-password.png), якщо забули його.
* **Account management:** користувачі можуть [редагувати інформацію свого облікового запису](./_images/account-editing.png).
* **Створюйте та публікуйте дописи:** користувачі можуть [писати та публікувати дописи](./_images/posting.png) у власному блозі.
* **Leave comments:** користувачі можуть [коментувати публікації](./_images/commenting.png) і взаємодіяти з іншими читачами.
* **View posts and comments:** користувачі можуть [переглядати власні публікації, коментарі](./_images/view-posting.png), а також публікації та коментарі інших користувачів.

## Getting Started

### Prerequisites
Щоб створити та запустити цей проект, вам знадобиться:
* [Java 17+](https://download.java.net/openjdk/jdk17/ri/openjdk-17+35_windows-x64_bin.zip)
* [Maven](https://dlcdn.apache.org/maven/maven-3/3.9.0/binaries/apache-maven-3.9.0-bin.zip)
* [SQLite](https://www.sqlite.org/2023/sqlite-tools-win32-x86-3410000.zip)
* [Make](https://deac-fra.dl.sourceforge.net/project/gnuwin32/make/3.81/make-3.81-bin.zip) and its [dependencies](https://altushost-swe.dl.sourceforge.net/project/gnuwin32/make/3.81/make-3.81-dep.zip) (optional, but recommended for an optimized development workflow)
* [MailHog](https://github.com/mailhog/MailHog/releases/download/v1.0.1/MailHog_windows_amd64.exe) (required if you want to test email functionality locally. Otherwise, you can modify the run properties to use a public SMTP server)

Вашим наступним кроком буде дотримання цих інструкцій:
1. Завантажте zip-архів Java 17 (або новіший) за наданим посиланням і розпакуйте його у вибране вами місце.
2. Якщо ви не використовуєте пакетну версію Maven із IDE, наприклад [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows), завантажте zip-архів Maven і також розпакуйте його у вибране вами місце.
3. SQLite Інструмент командного рядка під назвою sqlite3.exe уже включено в папку файлів проекту, тому вам не потрібно встановлювати його окремо.
4. Якщо ви хочете оптимізувати робочий процес розробки, ви можете встановити Make із його залежностями для Windows. Для цього скачайте zip-архів Make і розпакуйте папку bin програмою make.exe. Розмістіть залежності (наприклад, libintl3.dll і libiconv2.dll) в одній папці.
5. Змініть системну змінну середовища Path, щоб включити шляхи до папок bin для Java, Maven, SQLite та Make (якщо встановлено). Переконайтеся, що шляхи містять назву папки bin.
6. MailHog не потребує встановлення, оскільки це окремий локальний SMTP-сервер. Ви можете просто розмістити виконуваний файл, де забажаєте.

### Installation
1. Завантажте або клонуйте репозиторій проекту на локальну машину за допомогою `git clone https://github.com/Fluffy777/universe.git .` (де `.` буде вашою поточною папкою).
2. Відкрийте командну оболонку з кореневої папки проекту.
3. Виконайте таку команду, щоб створити базу даних SQLite у папці проекту: `make migrate`
4. Створіть проект, виконавши таку команду: `make`

### Configuration
Щоб налаштувати веб-програму, відредагуйте значення параметрів у файлі .properties. За замовчуванням файл називається `application.properties`, якщо ви використовуєте інструмент make. В іншому випадку ви можете назвати його як завгодно та вказати як аргумент виклику. Ви також можете використовувати змінні середовища. Налаштування аспектів програми, включаючи властивості вбудованого веб-сервера Jetty, конфігурацію розсилки, рівень безпеки та деталі підключення до бази даних, визначаються їх використанням. У репозиторії проекту є [файл із встановленими значеннями за замовчуванням](application.properties), який ви можете використовувати. Для більшої гнучкості зверніться до таблиці нижче.

|Key|Value|
|---|---|
|application.host|The IP address to which the application should bind|
|application.port|The port on which the application should run|
|application.bcryptStrength|The strength of the bcrypt encryption algorithm|
|database.filename|The path to the SQLite database in either absolute or relative form|
|mail.from|The email address of the sender of the email|
|mail.user|The identifier of the sender of the email on SMTP server|
|mail.password|The credential that is used to authenticate the email sender on SMTP server|
|mail.host|The IP address to which the SMTP server should bind|
|mail.port|The port on which the SMTP server should run|
|mail.ssl|Determines whether to use SSL encryption or not|
|mail.auth|Determines whether or not the email sender should be authenticated on the SMTP server|

### Run
1. Якщо ви віддаєте перевагу використанню локального сервера SMTP, запустіть MailHog. Зауважте, що хостом за замовчуванням встановлено 0.0.0.0, що в контексті цієї програми означає «localhost». Стандартними портами є 1025 для з’єднань SMTP і 8025 для з’єднань HTTP, які забезпечують корисний веб-інтерфейс для керування електронною поштою.
2. Запустіть програму, виконавши наступну команду з командної оболонки: `make run`

Це воно! Програма має бути запущена та запущена, і ви можете отримати доступ до неї за вказаним портом та URL-адресою у веб-браузері.

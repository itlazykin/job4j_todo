# Job4j_TODO Приложение "TODO список".

## Описание:
В данном проекте реализуется сервис со списком задач.
Сервис позволяет:
1. Вывести все задачи
2. Вывести только новые задачи
3. Вывести только выполненные задачи
4. Добавить задачу (название задачи, её описание)
5. Обновить задачу (название, описание, статус (новый или выполненный))
6. Удалить задачу

Стек технологий:
+ Java 17
+ PostgreSQL
+ Springframework.boot 2.7.6
+ Hibernate
+ Lombok
+ H2database
+ Liquibase

## Окружение:
- Java 17
- PostgreSQL 16
- Maven 3.8

## Запуск проекта
1. Создайте базу данных
``` sql
CREATE DATABASE todo
```

2. Клонируйте репозиторий
``` bash
git clone https://github.com/itlazykin/job4j_todo
cd job4j_todo
```

3. Соберите проект с помощью Maven:
``` bash
mvn clean install 
```

4. Запустите приложение:
``` bash
mvn spring-boot:run
```

После запуска, проект будет доступен по адресу: [http://localhost:8080](http://localhost:8080)

## Взаимодействие с приложением

1. Стартовая страница

![Стартовая страница](src/main/resources/templates/images/started.png)

2. Все задачи

![Все задачи](src/main/resources/templates/images/all.png)

3. Только выполненные

![Только выполненные](src/main/resources/templates/images/complete.png)

4. Только новые

![Только новые](src/main/resources/templates/images/new.png)

5. Добавление задачи

![Добавление задачи](src/main/resources/templates/images/addtask.png)

6. Обновление задачи

![Обновление задачи](src/main/resources/templates/images/editTask.png)

#### Контакты для связи:
* Лазыкин Денис Андреевич;
* +7 926 888 23 28;
* @slimdenchi

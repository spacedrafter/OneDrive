﻿# Гость
## 1. Регистрация
   1.1 Вариант использования начинается, когда пользователь кликнет по ссылке "Регистрация"
   1.2 Открывается соответствуюущая страница в окне браузера, в которой пользователь должен ввести
   - Имя
   + Фамилия
   + Адрес электронной почты
   + Пароль
   1.3 Если введены некорректные данные, то повторять пункт 1.2 пока не будут введены корректные данные
   1.4 Нажать кнопку отправить.
   1.5 Сервер начнет обработку данных и сделает запрос в БД
   1.6 Если в БД существует посетитель с таким адресом электронной почты, то сервер пошлет ответ с просьбой выполнить пункт 1.2
   1.7 Записать данные в БД и сделать посетителя пользователем
   1.8 Перевести пользователя на его "One Drive" в раздел "Просмотр".
![Registration](https://github.com/KirillKomarov550503/OneDrive/blob/master/Diagrams/Activity/%D1%80%D0%B5%D0%B3%D0%B8%D1%81%D1%82%D1%80%D0%B0%D1%86%D0%B8%D1%8F.png)

## 2. Авторизация
   2.1 Вариант использования начинается, когда пользователь кликнет по ссылке "Авторизация"
   2.2 Всплывает соответствующее окно в браузере, в которой пользователь должен ввести
   - Логин
   + Пароль
   2.3 Если введены некорректные данные, то повторить пункт 2.2 пока не будут введены корректные данные
   2.4 Нажать кнопку отправить
   2.5 Сервер начнет обработку данных и сделает запрос в БД
   2.6 Если в БД не существует такого человека, то 
   пошлет ответ с просьбой выполнить пункт 2.2 
   2.7 Если совпали логин и пароль, то в зависимости от роли человека присвоить ему соответствующую роль пользователя или администратора 
   2.8 Перевести человека на необходимую страницу в зависимости от роли. Пользователся на страницу Просмотр
![Authorization](https://github.com/KirillKomarov550503/OneDrive/blob/master/Diagrams/Activity/%D0%B0%D0%B2%D1%82%D0%BE%D1%80%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D1%8F.png)
Администратора на страницу Статистика
![Statistics](https://github.com/KirillKomarov550503/OneDrive/blob/master/Diagrams/Activity/statistics.png) 
---
# Пользователь
## 1. Просмотр списка файлов
   1.1 Варинат начинается, в случае нажатия ссылки "Просмотр" или же в случае успешной регистрации или авторизации
   1.2 Сервер пришлет список всех файлов хранящихся на "One Drive" пользователя.
![Look](https://github.com/KirillKomarov550503/OneDrive/blob/master/Diagrams/Activity/look.png)

## 2. Скачать с "One-Drive"
   2.1 Вариант начинается, после нажатия ссылки "Скачать"
   2.2 Сервер пришлет список всех файлов хранящихся на "One Drive" пользователя и справа от каждого файла будет кнопка с надписью 
   "Скачать"
   2.3 После нажатия кнопки "Скачать" будет скачан нужный файл.
![Download](https://github.com/KirillKomarov550503/OneDrive/blob/master/Diagrams/Activity/download.png)

## 3. Удалить c "One-Drive"
   3.1 Варинат начинается, в случае нажатия ссылки "Удалить"
   3.2 Сервер пришлет список всех файлов хранящихся на "One-Drive" пользователя и справа от каждого файла будет кнопка с надписью 
   "Удалить"
   3.3 После нажатия кнопки "Скачать" будет удален нужный файл, сервер перезагрузит страницу и пришлет новый список файлов.
![Remove](https://github.com/KirillKomarov550503/OneDrive/blob/master/Diagrams/Activity/remove.png)

## 4. Загрузить файлы на "One-Drive"
   4.1 Вариант начинается, после нажатия ссылки "Добавить"
   4.2 Сервер пришлет страницу с кнопками "Добавить" и "Отправить".
   4.3 После нажатия кноки Добавить откроется проводник
   4.4 Пользователь выберет список файлов и нажмет ОК.
   4.5 После нажатия кнопки сервер добавит файлы в One-Drive пользователя.
![Upload](https://github.com/KirillKomarov550503/OneDrive/blob/master/Diagrams/Activity/add.png)

## 5. Выход из учетной записи
   5.1 Вариант начинается, после нажатия ссылки "Выход"
   5.2 Пользователь будет переведен в статус посетителя и попадет на главную страницу сайта.
![Logout](https://github.com/KirillKomarov550503/OneDrive/blob/master/Diagrams/Activity/out.png)

---
# Администратор
## 1. Получить данные согласно выбраной статистике
   1.1 Выбрать параметры статистики.
   1.2 Нажать кнопку "Получить статистику" .
   1.3 После нажатия кнопки сервер пришлет данные статистики.
![Statistics](https://github.com/KirillKomarov550503/OneDrive/blob/master/Diagrams/Activity/statistics.png)


package com.api.i18n.bundle;

import java.util.ListResourceBundle;

public class Language_ru_RU extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{

                // General
                {"register", "Регистрация"},
                {"login", "Вход"},
                {"message","Сообщение"},
                {"nickname","Логин"},
                {"password","Пароль"},
                {"warning", "Предупреждение"},
                {"loginFailure","Неверные логин и/или пароль"},
                {"registrationFailure","Пользователь с таким именем уже существует"},
                {"greeting_sever","Вас приветствует терминал управления сервером. Введите save для сохранения коллекции, exit - для остановки сервера."},
                {"language", "Язык"},
                {"help","Помощь"},
                {"about","О нас"},
                {"mode","Режим"},
                {"table","Таблица"},
                {"canvas","Холст"},
                {"logOut","Выход"},
                {"desk","Стол"},
                {"command","Команда"},
                {"action","Действие"},
                {"dragon","Дракон"},
                {"general","Общее"},
                {"location","Локация"},
                {"xCoordinate","X координата"},
                {"yCoordinate","Y координата"},
                {"submit","Подтвердить"},
                {"clear","Очистить"},
                {"skill","Навыки"},
                {"info","Инфо"},
                {"size","Размер"},
                {"pickedSize","Выбранный размер"},


                // Dragon info
                {"dragon","Дракон"},
                {"dragons","Драконы"},
                {"id","Идентификатор"},
                {"name","Имя"},
                {"coordinates","Координаты"},
                {"creationDate","Дата создания"},
                {"age","Возраст"},
                {"type","Тип"},
                {"size","Размер"},
                {"character","Характер"},
                {"cave","Пещера"},

                // Command description
                {"infoAdd","Добавить новый элемент в коллекцию"},
                {"infoClear","Очистить коллекцию"},
                {"infoExecuteScript","Считать и исполнить скрипт из файла"},
                {"infoExit","Завершить программу (без сохранения в файл)"},
                {"infoFilterGreaterThanColor","Вывести элементы, значение поля color которых больше заданного"},
                {"infoFilterLessThanCharacter","Вывести элементы, значение поля character которых меньше заданного"},
                {"infoHelp","Вывести справку по доступным командам"},
                {"infoInfo","Вывести информацию о коллекции"},
                {"infoInsertAtIndex","Добавить элемент в заданную позицию"},
                {"infoRemoveAllByCave","Удалить элемент, значение cave которого равно заданному"},
                {"infoRemoveAtIndex","Удалить элемент в заданной позиции"},
                {"infoRemoveById","Удалить элемент, ID которого равен заданному"},
                {"infoSave","Сохранить коллекцию в файл"},
                {"infoShow","Вывести коллекцию"},
                {"infoShuffle","Перемешать элементы коллекции в случайном порядке"},
                {"infoUpdateId","Обновить значение элемента с заданным ID"},

                // Info
                {"askForNull","Введите NULL, чтобы не вводить характеристики пещеры (Или любое другое значение, чтобы продолжить):"},

                // Exceptions
                {"scriptNotValid","Некорректный скрипт"},
                {"fileNotFound","Файл не найден"},
                {"invalidInput","Некорректный ввод"},
                {"inputGreaterZero","Значение поля должно быть больше нуля!"},
                {"notNullField","Поле не может быть null"},
                {"noSuchCommand","Неизвестная команда"},
                {"recursiveCallScript","Нельзя вызвать файл из самого себя!"},

                // Obj input
                {"enterName","Введите имя:"},
                {"enterCoordinates","Введите координаты (Double, int через пробел):"},
                {"enterAge","Введите возраст:"},
                {"enterColor","Введите цвет (RED, BLACK, BLUE, ORANGE):"},
                {"enterType","Введите тип (WATER, AIR, FIRE):"},
                {"enterCharacter","Введите характер (CUNNING, CHAOTIC, FICKLE):"},
                {"enterDepth","Введите глубину пещеры:"},
                {"enterWealth","Введите количество богатства:"},

                // Bool
                {"booleanOpTrue","Операция выполнена успешно"},
                {"booleanOpFalse","Операция не выполнена"}
        };
    }
}

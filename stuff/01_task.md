## Задание 1.

### **Декомпозируйте Java-core.**

Студенты Практикума в любой профессии могут пройти бесплатный вводный курс продолжительностью 20 часов. По окончании 
триала студенты делают мини-проект, и весь теоретический курс ведёт студента именно к проекту. При прохождении триала студент
выполняет обязательные задания в онлайн-тренажёре: пишет код, решает задачи.
Сформулируйте основные темы и подтемы для бесплатного курса «с нуля» и распределите их в последовательности обучения. 
Предложите идею финального проекта для бесплатного курса.


----------


Заголовки подзаголовки — темы и подтемы.

Ненумерованные списки внутри тем - о чем будет в этой теме рассказываться.

## Добро пожаловать!

(0,3ч, итого 0.3ч)

### Чему мы обучаем

- Бекенд — это мозги любого онлайн ресурса <...>
- Java - один из самых распространенных и зарекомендовавших себя языков
- Также научим инструментам и сопутствующих технологиям - git, sql, http и так далее
- А еще научим работе с популярным фреймворком Spring

### Что вы сможете создавать

- Бекенд приложений, таких как яндекс-такси, вконтакте или озон
- Устойчивые системы, которые не отказывают в самый неподходящий момент 
  
### Что вам потребуется

- Для прохождения этого курса не требуется никакой подготовки...
- ...Даже математика не является обязательным условием, чтобы научиться программировать
- Единственная необходимая вещь — ноутбук / компьютер
   
### Как построен процесс обучения

- Мы будем изучать базовые концепции шаг за шагом
- Для обучения будем использовать тренажер и удаленные серверы 
- В конце даже посмотрим ваше первое приложение!

## Основы программирования на Java

(1.5ч, итого 1.8ч)

### Первая программа!

- Hello world на java (тренажер + объяснение как работать с тренажером)
- А теперь скажи не "привет, мир", а "привет, java" (тренажер?)

### Синтаксис

- Программы пишутся по правилам или что такое синтаксис
- Задания вида "попробуй угадать, что делает эта программа"
- Обрати внимание, в конце каждой строки — точка с запятой
- Программа сработает только если она написана по правилам синтаксиса
   - Ошибки — это нормально. Программы пытаются всеми силами рассказать, почему они не могут выполниться, поэтому ошибки
     стоит читать всегда
   - Пример в тренажере — запусти программу, где забыли точку с запятой. Обрати внимание, что говорится в ошибке
   - А теперь поставь точку с запятой и посмотри что получится
- Комментарии в коде
    - `// однострочные комментарии`
    - ```
      /* многострочные
      комментарии */
      ```

### Переменные и присваивание

(1.0ч, итого 2.8ч)

#### Типы данных

- Примитивные типы данных 
- Присваивание (тренажер)
- Арифметические операции (тренажер)
- Строки
   - Конкатенация строк

#### Списки

- Массивы и индексы (тренажер)
- Индексы считаются с нуля (тренажер)
- Что будет, если взять несуществующий индекс (тренажер)
 
## Ветвления и циклы

### Условные конструкции

(1ч, итого 3.8ч)
   
#### Если — то 

- `if`
- `else`
- `if else if else`
- Блок кода заключается в `{}`. Задание в тренажере на отсутствие блока.

#### Логические операции

- `&&`, `||`, `!`
- Приоритеты логических операций
 
### Циклы

(1.5ч, итого 5.3ч)

#### Цикл for
   - От наименьшего в наибольшему
   - От наибольшего к наименьшему
   - Проходить по 2 элемента одновременно
   - Выход за пределы цикла
     - как выглядит ошибка — тренажер
   - Бесконечные циклы
   - Цикл внутри цикла 
   
#### Цикл while
  - Использование
  - for - это тоже while
    
#### Другие циклы

- do... while
- do... while - это тоже while
- foreach 

#### Break & continue

- break
  - Бесконечный цикл + break
- continue

#### Множественный выбор

- `switch` и `break`

## Функции 

Первые 2 раздела
(1.7ч, итого 7.0ч)

### Зачем нужны функции 


- Можно вызвать из разных мест 
- Можно дать имя набору операций
- Можно написать комментарий, что функция делает

### Определение собственных функций

- Из чего состоит определение
- Аргументы и вывод функции
  - `return`
  - Использование `return`, как `break` для функций
- Функции без вывода
- Функции без аргументов
- Функции без вывода и без аргументов
- Вызов функций внутри других функций

### Функции стандартной библиотеки

(1.0ч, итого 8.0ч)

- Что такое стандартная библиотека
- Еще раз про строки
  - Методы String - `toUpperCase`, `concat`, `substring`, `split`

  
## Типы данных стандартной библиотеки

- Стандартная библиотека определяет не только функции, но и целые типы данных

### Коллекции

(2.0ч, итого 10.0ч)

#### `ArrayList`
  
- Смысл коллекции. Чем отличается от массива
- Здесь используется новый вид записи `ArrayList<String>`
- Давайте пока считать, что значение внутри `<>` определяет, какой тип данных содержится в этой коллекции
- Более подробно про задание типа данных для коллекций мы поговорим в одном из следующих разделов
- Здесь же: Почему `ArrayList<Integer>`, а не `ArrayList<int>` - кратко про объекты vs примитивы

#### `HashMap`

- Смысл коллекции
- Создание / Добавление / Удаление
- Проверка наличия элемента

#### `HashSet`
  
- Смысл коллекции
- Создание / Добавление / Удаление
- Проверка наличия элемента

## Экватор проект 

(2.0, итого 12ч)

- Вариант 1: Украсть из курса по питону задание про помощника Анфису подчистую :)
- Вариант 2: см. ниже  

### Определитель поезда

#### Дано
  - `Map<String, List<Integer> hourToTrains` - Время в часах на список номеров поездов. 
    - Время задано как часы `16:00`, `17:00` и т.д. Всего 24 ключа: `00:00`, `01:00`, ..., `23:00`.
  - `Map<Integer, List<String>> trainToLocations` - Номер поезда к маршруту
    - Все ключи есть хотя бы в одном списке времени в `hourToTrains`

#### Задание 

#####  Первая часть  

(На базовые операции со строками)

Написать функцию `public List<Integer> nextHour(String currentTime)`, которая должна возвращать следующий допустимый 
промежуток времени с маршрутами. 

Пример: `nextHour("16:32") -> "17:00"`

##### Вторая часть

(Множества + хождение по коллекциям) 

Вывести список всех локаций, в которые можно попасть в течение дня

Решение:
  - Цикл от 0 до 23
  - Конструирование строки из числа (`3 -> "03:00"`)
  - На каждом шаге смотреть список поездов, на которых можно уехать
  - Преобразование каждого списка локаций в множество
  - Объединение только что созданного множества и результирующего множества
  - Вывод результирующего множества

##### Третья часть  

(Преждевременный выход из функций + все то же хождение по коллекциям)

Написать функцию `public String closestTrain(String currentTime, String targetLocation)`, которая вернет строку с номером
ближайшего поезда и временем его отправления

Решение:
  - Применить к текущему времени уже созданную функцию `nextHour`
  - Проходить циклом по времени от текущего до `23:00` 
  - На каждом шаге смотреть список поездов, на которых можно уехать
  - Для каждого поезда — вложенный цикл по его списку локаций
  - Если в списке локаций найдена `targetLocation` -
вернуть строку `Номер ближайщего поезда в %targetLocation% - %NUMBER%. Время отправления - %TIME%`, где `%TIME%` - время из `hourToTrains` 

## Классы и объекты

### Введение в классы и объекты

(2.0ч, итого 14ч)

- Что такое класс и объект
- Что такое методы, поля и конструкторы
- Создание объектов из классов
  - Тренажер "мой первый класс"
- "Точечная" нотация для изменения состояния объекта (тренажер)

#### Конструкторы

- Определение конструктора
- Конструктор по-умолчанию

#### Модификаторы видимости

- public / private / no-modifier
- Понятие `инкапсуляции`.

#### Передача по ссылке и по значения

(1.0ч, итого 15.0ч)

- Примеры
- equals и hashCode
- Что будет если переопределить неправильно

### Наследование

(3ч, итого 18.0ч)

- Использование наследования
- Что наследуется и что не наследуется
- Модификатор видимости `protected`
- Переопределение методов
- Все наследуется от `Object` 
  - Переопределение `toString()`
  - Прочие методы `Object`

#### Интерфейсы

- Реализация интерфейса
- Множественные интерфейсы
- Интерфейс стандартной библиотеки - `Comparable`

#### Введение в параметрический полиморфизм

- Простые примеры с `<T>` без ограничений снизу / сверху
- Примеры из стандартной библиотеки (Коллекции)
- Тренажер

## Финальный проект

(2ч, итого 20ч)

### Определитель поезда v2.0

Приложение по определению поездов усложняется. Теперь нам необходимо работать с точным
временем отправления, в локациях появилось время паузы. При этом пользователи хотят знать, сколько времени займет их поездка.

#### Дано

Класс `Train` 
```java
class Train {
    private Integer number;
    private Boolean isFastTrain;
}
```

Класс `Location` 

```java
class Location {
    private String name;
    private Integer stopTimeMinutes;
}
```


#### Задание

##### Первая часть

Создать класс `Route`, включающий в себя информацию о маршруте 

Класс `Route` должен включать в себя:
  - Список локаций - `List<Location> locations`
  - Время поезда в пути (без остановок) `Integer timeWihtoutStopsMinutes`
  - Функция для определения общего времени пути, который пройдет поезд. Функция должна складывать `timeWithoutStopsMinutes`, 
со значением `stopTimeMinutes` каждой локаций на этом пути.
  - Конструктор, принимающий на вход список локаций и общее время в пути без остановок
  - Метод `toString` должен выводить
  ```
  Время в пути timeWithoutStopsMinutes(), маршрут: %locations%
  ```

Локации перечисляются через запятую с пробелом.

В задании в `main` уже приведен код по созданию маршрутов с необходимыми вызовами. Требуется реализовать только класс

##### Вторая часть

Создать наследник класса `Route` - класс `TrainRoute`. Он должен включать в себя:

- Поле с указанием конкретного поезда `Train train`
- Поле с указанием времени начала поездки `String time`
- Должен переопределять значение функции `timeWithoutStopsMinutes`. Если поезд обычный — время остается такое же. Если 
же поезд скорый `isFastTrain == true` - общее время в пути должно быть меньше на `30%`
- Конструктор, принимающий дополнительный параметр поезд
- Метод `toString` должен выводить 
```
[Скорый] поезд № %number% с временем отправления %time% и временем в пути timeWithoutStopsMinutes() идет по маршруту: %location%`
```

Локации перечисляются через запятую с пробелом.

В задании в `main` уже приведен код по созданию маршрутов поезда с необходимыми вызовами. Требуется реализовать только класс
# algorithm-java

![img](https://blog.yena.io/assets/post-img18/181114-04.png)

![[img]](https://blog.kakaocdn.net/dn/bdy438/btqEjPZKIY0/e5Wm8ZJmdRNza4tKBzaK6k/img.png)

[참고 블로그](https://coding-factory.tistory.com/category/Language/Java?page=2)

## ✔ 문자열

**💡 문자열 길이 (null은 포함하지 않음)**

```java
String str = 'abc';
str.length(); //int형 반환
```

**💡 문자열 비어있는지 확인**

```java
str.isEmpty(); //boolean형 반환
```

**💡 문자 반환**

```java
str.charAt(index); //char형 반환
```

**💡 문자 배열 복사**

```java
char[] clone = new char[크기];
str.getChars(str의 시작, str의 끝, 복사받을 char 배열, 복사 시작 위치);
```

**💡 문자열 비교**

자바에서는 `==` 연산자로 문자열 비교를 할 수 없다. (주소값)

```java
str.equals(비교문자열); //boolean형 반환
```

```java
str.compareTo(str2); //사전순으로 비교
/*
같은 경우 0
str이 앞인경우 -1
str이 뒤인경우 1
* str의 마지막 문자열과 str2의 마지막 문자를 제외하고 같은 경우
예) String str = new String("ccca");
    String str2 = new String("cccz");
    str과 str2의 마지막 문자열을 비교하여 사전 순 차이만큼 반환 : -25

*/
```

**💡 문자열 위치**

```java
str.indexOf(찾을 문자);	//int형 반환, 존재하지 않으면 -1 반환
str.lastIndexOf(찾을 문자); //int형 반환, 해당 문자가 마지막으로 위치하는 인덱스 반환
```

**💡 문자열 자르기**

```java
str.subString(2); //앞에서부터 index전 까지 자름 남은거 String 반환 3~끝까지 반환
str.subString(시작index, 끝index); // ex) (1,3) -> 1 2 반환
```

**💡 문자열 합치기**

```java
str.concat(str2);
str + str2;
```

**💡 문자열 치환**

```java
str.replace('a','b'); //a를 b로 치환
```

**💡 문자열 포함**

```java
str.contains(문자열); //boolean형 반환
```

**💡 문자열 분리**

```java
str.split(문자열); //해당 문자열 기준으로 분리 String[] 반환
```

**💡 문자열 공백 제거**

문자열 사이의 공백은 제거되지 않음

```java
str.trim();
```

**💡 문자열 형변환**

```java
Integer.toString(int값); //int -> String
Integer.parseInt(문자열); //String -> int
```

---

## ✔ 컬렉션 프레임워크

배열의 크기는 생성할 때 결정되고 그 크기를 넘어가면 더이상 데이터를 저장할 수 없다는 크기가 고정적이라는 단점이 있다. 또 데이터를 삭제하면 해당 인덱스의 데이터는 비어있게 되어 메모리가 낭비되는 등의 여러문제가 발생하는데 그런 문제점을 해결하기위해 만들어둔 자료구조를 모아둔 라이브러리를 컬렉션 프레임워크라 한다.

#### ✅ List 컬렉션

List 컬렉션은 객체를 인덱스로 관리하기 때문에 객체를 저장하면 자동 인덱스가 부여되고 인덱스로 객체를 검색, 삭제할 수 있는 기능을 제공한다. 객체 자체를 저장하는 것아 아닌 객체의 번지를 참조한다. 동일한 객체를 중복 저장 할 수 있는데 이 경우 동일한 번지가 참조된다. null값도 저장이 가능한데 이 경우 해당 인덱스는 객체를 참조하지 않는다.

| 메서드                         | 설명                                                  |
| ------------------------------ | ----------------------------------------------------- |
| boolean add(E e)               | 주어진 객체를 맨 끝에 추가합니다.                     |
| void add(int index, E element) | 주어진 인덱스에 객체를 추가합니다.                    |
| set(int index, E element)      | 주어진 인덱스에 저장된 객체를 주어진 객체로 바꿉니다. |
| boolean contains(Object o)     | 주어진 객체가 있는지에 대한 여부를 검색합니다.        |
| E get(int index)               | 주어진 인덱스에 저장된 객체를 리턴합니다.             |
| boolean isEmpty()              | 컬렉션이 비어있는지 여부를 확인합니다.                |
| int size()                     | 저장되어 있는 전체 객체 수를 리턴합니다.              |
| E remove(int index)            | 주어진 인덱스에 저장된 객체를 삭제합니다.             |
| void clear()                   | 주어진 인덱스에 저장된 객체를 삭제합니다.             |
| boolean remove(Object o)       | 주어진 객체를 삭제합니다.                             |

📎 [ArrayLIst](#-arraylist)

📎 [LinkedList](#-linkedlist)

📎 [Vector](#-vector)

#### ✅ Set 컬렉션

List 컬렉션은 추가한 순서대로 저장되어 순서를 유지하지만 Set 컬렉션은 저장 순서가 유지되지 않는다. 순서 자체가 없으므로 인덱스로 객체를 검색해서 가져오는 get(index) 메서드는 존재하지 않고, 대신 전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자(Iterator)를 제공한다. 또한 Set은 객체를 중복해서 저장할 수 없고 하나의 중복 저장이 안되기 때문에 null값도 하나만 저장할 수 있다.

| 메서드                     | 설명                                                         |
| -------------------------- | ------------------------------------------------------------ |
| boolean add(E e)           | 주어진 객체를 저장 후 성공적이면 true를 중복 객체면 false를 리턴합니다. |
| boolean contains(Object o) | 주어진 객체가 저장되어있는지 여부를 리턴합니다.              |
| Iterator<E> iterator()     | 저장된 객체를 한번씩 가져오는 반복자를 리턴합니다.           |
| isEmpty()                  | 컬렉션이 비어있는지 조사합니다.                              |
| int Size()                 | 저장되어 있는 전체 객체수를 리턴합니다.                      |
| void clear()               | 저장된 모든 객체를 삭제합니다.                               |
| boolean remove(Object o)   | 주어진 객체를 삭제합니다.                                    |

Set은 순서와 상관없이 어떤 데이터가 존재하고 있는지를 체크하기 위해 주로 사용하고 데이터를 중복저장하지 않고 사용자가 입력한 저장 순서도 유지하지 않는다.

📎 [HashSet](#-hashset) 데이터 저장 순서를 유지할 필요가 전혀 없는 데이터들을 저장하는데 주로 사용 성능이 제일 좋은 편이다.

📎 [TreeSet](#-treeset) 트리형식으로 저장된 데이터의 값에 따라 자동 정렬 및 저장된다. HashSet보다는 성능이 조금 떨어진다.

📎 [LinkedHashSet](#) 링크드리스트 형식으로 저장되는 HashSet으로 사용자가 데이터를 저장한 순서를 유지한다. 셋 중 성능이 제일 낮다.(안좋음)

#### ✅ Map 컬렉션

Map 컬렉션은 키(key)와 값(value)으로 구성된 객체를 저장하는 자료구조로, 키는 중복으로 저장할 수 없고 값은 중복으로 저장할 수 있으며 중복된 key값이 들어온다면 기존의 값은 없어지고 새로운 값으로 대체 된다.

| 메서드                              | 설명                                                         |
| ----------------------------------- | ------------------------------------------------------------ |
| V put(K Key, V value)               | 주어진 키와 값을 추가하여 저장되면 값을 리턴합니다.          |
| boolean containsKey(Object Key)     | 주어진 키가 있는지 확인합니다.                               |
| boolean containsValue(Object value) | 주어진 값이 있는지 확인합니다.                               |
| Set<Map.Entry<K,V>> entrySet()      | 모든 Map.Entry 객체를 Set에 담아 리턴합니다.                 |
| Set<K> keySet()                     | 모든 키를 Set객체에 담아서 리턴합니다.                       |
| V get(Object key)                   | 주어진 키에 있는 값을 리턴합니다.                            |
| V getOrDefault(Object key, V)       | 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환한다. |
| boolean isEmpty()                   | 컬렉션이 비어있는지 조사합니다.                              |
| int Size()                          | 저장되어 있는 전체 객체의 수를 리턴합니다.                   |
| Collection<V> values()              | 저장된 모든 값을 Collection에 담아서 리턴합니다.             |
| void clear()                        | 저장된 모든 Map.Entry를 삭제합니다.                          |
| V remove(Object Key)                | 주어진 키와 일치하는 Map.Entry를 삭제하고 값을 리턴합니다.   |

📎 [HashMap](#-hashmap)

---

## ✔ ArrayList

**💡 선언**

```java
import java.util.ArrayList;
ArrayList<Integer> arrayList = new ArrayList<>();
```

size를 초기화해줄 필요 없다. 배열처럼 고정된 크기를 가지는 것이 아니라 메모리가 허용하는 한 자동으로 ArrayList 크기는 동적으로 변경된다.

**💡 데이터 추가**

```java
// 데이터 하나 추가
boolean add(E e);
arrayList.add(1);
arrayList.add(null); //null값도 add가능

// 특정 위치에 하나 추가
void add(int index, E element);
arrayList.add(int index, E element);
```

```java
//ArrayList에 ArrayList 추가
boolean addAll(Collection<? extends E> c);
arrayList.addAll(arrayList2);

//특정 위치에 ArrayList 추가
boolean addAll(int index, Collection<? extends E> c);
arrayList.addAll(3, arrayList2);
```

**💡 데이터 삭제**

```java
boolean remove(int index);
arrayList.remove(2);
```

**💡 특정 데이터 가져오기**

```java
//하나 가져오기
E get(int index);
arrayList.get(2);

//범위 지정해서 List로 가져오기
List<E> subLit(int fromIndex, int toIndex);
arrayList.subList(1,3);
```

---

## ✔ LinkedList

ArrayList에 비해 추가나 삭제가 용이하지만 인덱스가 없어서 특정요소에 접근하기 위해 순차 탐색이 필요하므로 탐색 속도가 떨어진다. 그러므로 탐색 또는 정렬을 자주하는 경우에는 배열을 사용하고 데이터의 추가/삭제가 많은 경우 연결리스트를 사용한다.

**💡 선언**

```java
LiskedList<E> linkedList = new LinkedList<>();
```

**💡 데이터 추가**

```java
linkedList.addFirst(1); //가장 앞에 데이터 추가
linkedList.addLast(1);	//가장 뒤에 데이터 추가
linkedList.add(1);		//마지막에 데이터 추가
linkedList.add(1,2);	//index 1뒤에 10 추가
```

**💡 데이터 삭제**

```java
linkedList.removeFirst();	//가장 앞의 데이터 제거
linkedList.removeLast();	//가장 뒤의 데이터 제거
linkedList.remove();		//생략시 0번째 index제거
linkedList.remove(1);		//index 1 제거
linkedList.clear();			//모든 값 제거
```

**💡 데이터 검색**

```java
linkedList.contains(1);	//1이 있으면 true, 없으면 false
linkedList.indexOf(1)	//1이 있는 index 반환, 없으면 -1
```

---

## ✔ Vector

Vector는 ArrayList와 동일한 내부구조를 가지고 있다. ArryaList와 마찬가지로 Vector내부에 값이 추가되면 자동으로 크기가 조절되고 그 다음 객체들은 한 자리씩 뒤로 이동한다. 하지만 Vector는 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 이 메소드들을 실행할 수 없고 하나의 스레드가 실행을 완료해야만 다른 스레드들이 실행할 수 있다. 그래서 멀티 스레드 환경에서 안전하게 객체를 추가하고 삭제할 수 있다.

Vector는 항상 동기화가 되다는 장점이자 단점을 가지고 있는데 스레드가 한 개일 때에도 동기화를 하기 때문에 ArrayList보다 성능이 떨어진다. ArrayList는 기본적인 기능은 벡터와 동일하나 자동 동기화 기능이 빠져있고, 동기화 옵션이 존재한다. 그리고 벡터의 비해 속도가 더 빠르기 때문에 많이 쓰인다.

**💡 선언**

```java
Vector<E> vector = new Vector<>();
```

**💡 추가**

```java
vector.add(3);
vector.add(null);
vector.add(1, 2);	//index 1뒤에 2삽입
```

**💡 삭제**

```java
vector.remove(1);	//index 1 값 제거
vector.removeAllElements();	//모든 값 제거
vector.clear();		//모든 값 제거
```

---

## ✔ HashSet

Set은 객체를 중복해서 저장할 수 없고 하나의 null값만 저장할 수 있고 저장 순서가 유지 되지않는다.(저장순서를 유지해야한다면 LinkedHashSet 클래스를 사용하자) Set 인터페이스를 구현한 클래스로 HashSet과 TreeSet이 있는데 HashSet은 정렬을 해주지않고 TreeSet은 자동정렬을 해준다. Set의 큰 장점은 중복을 제거해준다는 점이다. 추가 삭제의 경우 Set 내부에 있는지 검색한 후 이루어지기 때문에 List구조에 비해 속도가 느리다.

**중복을 걸러내는 과정**

HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode()메소드를 호출해 해시 코드를 얻어낸 다음 저장되어있는 객체들의 해시 코드와 비교한 뒤 같은 해시 코드가 있다면 다시 equals() 메소드로 두 객체를 비교해 true가 나오면 동일한 객체로 판단하도 중복을 저장하지 않는다. 문자열을 HashSet에 저장할 경우 같은 문자열을 갖는 String객체는 동일한 객체로 간주되고 다른 문자열을 갖는 String 객체는 다른 객체로 간주되는데 그 이유는 String 클래스가 hashCode()와 equals() 메소드를 재정의해서 같은 문자열일 경우 hashCode() 의 리턴값을 같게, equals()의 리턴값은 true가 나오도록 했기 때문이다.

**💡 선언**

```java
HashSet<Integer> set1 = new HashSet<Integer>();//HashSet생성
HashSet<Integer> set2 = new HashSet<>();//new에서 타입 파라미터 생략가능
HashSet<Integer> set3 = new HashSet<Integer>(set1);//set1의 모든 값을 가진 HashSet생성
HashSet<Integer> set4 = new HashSet<Integer>(10);//초기 용량(capacity)지정
HashSet<Integer> set5 = new HashSet<Integer>(10, 0.7f);//초기 capacity,load factor지정
HashSet<Integer> set6 = new HashSet<Integer>(Arrays.asList(1,2,3));//초기값 지정
```

---

## ✔ HashMap

HashMap은 Map 인터페이스를 구현한 대표적인 Map 컬렉션이다. Map 인터페이스를 상속하고 있기에 Map의 성질을 그대로 가지고 있다. Map은 키와 값으로 구성된 Entry 객체를 저장하는 구조를 가지고 있는 자료구조이다. 여기서 키와 값은 모두 객체이다. 값은 중복 저장될 수 있지만 키는 중복 저장될 수 없다. 만약 기존 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대체 된다. HashMap은 이름 그대로 해싱(Hashing)을 사용하기 때문에 많은 양의 데이터를 검색하는 데 있어서 뛰어난 성능을 보인다.

![img](https://blog.kakaocdn.net/dn/cfpMTT/btqEvxLt6qb/MXYNWUvXCKfRvNWjDMZoq0/img.png)

위 그림과 같이 HashMap은 내부에 '키'와 '값'을 저장하는 자료구조를 가지고 있다. HashMap은 해시 함수를 통해 '키'와 '값'이 저장되는 위치를 결정하므로 사용자는 그 위치를 알 수 없고, 삽입되는 순서와 들어있는 위치 또한 관계 없다.

**💡 선언**

```java
// HashMap 생성
HashMap<String,String> map1 = new HashMap<String,String>();

//new에서 타입 파라미터 생략가능
HashMap<String,String> map2 = new HashMap<>();

//map1의 모든 값을 가진 HashMap생성
HashMap<String,String> map3 = new HashMap<>(map1);

//초기 용량(capacity)지정
HashMap<String,String> map4 = new HashMap<>(10);

//초기 capacity,load factor지정
HashMap<String,String> map5 = new HashMap<>(10, 0.7f);

//초기값 지정
HashMap<String,String> map6 = new HashMap<String,String>(){{
    put("a","b");
}};
```

HashMap은 저장 공간을 초과해서 값이 들어오면 List처럼 한 칸씩 늘리지 않고 두배로 늘리게 되면서 과부하가 많이 발생한다. 그래서 초기에 저장할 데이터 개수를 알고 있다면 Map의 초기 용량을 지정해주는 것이 좋다.

**💡 데이터 추가**

```java
map.put(key, value);
```

**💡 데이터 삭제**

```java
map.remove(key); //key값으로 Map의 요소를 삭제
map.clear();	 //모든 값 제거
```

**💡 데이터 조회**

```java
map.get(key); 	//특정 key의 value를 가져오기
map.keySet();	//모든 key 반환
map.entrySet(); //많은 데이터를 가져와야하는 경우 2번째는 많은 시간이 소요되니까 이게 좋음
```

**💡 정렬**

- Key 정렬

```java
Object sortMap = map.ketSet().toArray();
Arrays.sort(sortMap);
```

- Value 정렬 : compareTo를 사용

```java
List<Integer> keySetList = new ArrayList<>(map.keySet());
//오름차순
Collections.sort(keySetList, (o1, o2) -> (map.get(01).compareTo(map.get(o2))));
//내림차순
Collections.sort(keySetList, (o1, o2) -> (map.get(02).compareTo(map.get(o1))));
```

---

## ✔ Stack

스택은 배열과 연결리스트로 구현할 수 있다. 하지만 자바에서 제공해주지롱

**💡 선언**

```java
import java.util.Stack;
Stack<Element> stack = new Stack<>();
```

**💡 데이터 추가**

```java
stack.push(값);
```

**💡 데이터 삭제**

```java
stack.pop();
```

**💡 데이터 조회**

```java
stack.peek();
```

**💡 스택 비었는지 확인**

```java
stack.empty();
```

**💡 위치 확인**

index를 반환하는 것이 아닌 순번을 반환한다. 스택구조에서 몇번째에 있는지를 반환

```java
stack.search(Object o);
```

**💡 스택 크기**

```java
stack.size();
```

**💡 데이터 포함 여부**

```java
stack.contains(1);
```

---

## ✔ Queue

- 선입선출 FIFO(First In First Out)구조
- 한 쪽 끝은 front로 삭제 연산만 수행
- 다른 한 쪽은 rear로 삽입 연산만 수행
- 그래프의 넓이 우선 탐색(BFS)에서 사용
- 컴퓨터 버퍼에서 주로 사용 - 마구 입력이 되었으나 처리를 하지 못할 때, 버퍼(큐)를 만들어 대기시킴

**💡 선언**

```java
import java.util.LinkedList;
import java.util.Queue;
Queue<Element> queue = new LinkedList<>();
```

**💡 데이터 추가**

```java
queue.add(값);	//삽입 성공 true, 여유 공간 없어 실패 IllegalStateException 발생
queue.offer(값);
```

**💡 데이터 삭제**

```java
queue.poll();       // queue에 첫번째 값을 반환하고 제거 비어있다면 null
queue.remove();     // queue의 앞쪽 값 제거
queue.clear(); 		// queue 초기화
```

**💡 데이터 조회**

```java
queue.peek();		// 앞쪽 값 참조
```

---

## ✔ 우선순위 큐

- 높은 우선 순위 요소를 먼저 꺼내서 처리
- 내부 요소는 힙으로 구성되어 이진트리 구조 **O(N logN)**

**💡 선언**

```java
import java.util.PriorityQueue;
PriorityQueue<Element> priorityQueue = new PriorityQueue<>(); //낮은 숫자순
PriorityQueue<Element> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); //높은 숫자순
```

**💡 데이터 추가**

```java
priorityQueue.add(값);	//삽입 성공 true, 여유 공간 없어 실패 IllegalStateException 발생
priorityQueue.offer(값);
```

우선순위에 값을  추가하면 즉시 정렬이 된다

**💡 데이터 삭제**

```java
priorityQueue.poll();       // priorityQueue 첫번째 값을 반환하고 제거 비어있다면 null
priorityQueue.remove();     // priorityQueue 루트 값 제거
priorityQueue.clear(); 		// priorityQueue 초기화
```

**💡 데이터 조회**

```java
priorityQueue.peek();		// 우선순위가 가장 높은 값 참조
```

---

## ✔ 이진탐색

- 정렬되어 있는 배열에서 빠르게 특정한 데이터를 찾는 방법
- **탐색 범위를 절반씩 좁혀가며** 데이터를 탐색
- 데이터의 개수가 N개일 때 탐색에 필요한 시간 복잡도 **O(logN)**
- 탐색 범위가 큰 문제 및 쿼리(Query)를 다루는 문제에 자주 사용
- 코테에서 이진탐색을 이용해 시간 단축할 수 있는 문제가 많이 출제됨(난이도 상)

**java.util.Arrays 클래스의 binarySearch 메서드**

```java
import java.util.Arrays;

public class binarySearch {
    //이진탐색의 전제조건은 이미 정렬(sort)되어있다고 가정
    int[] array = [1,2,3,4,5,6,7,8,9,10];
    int key = 2; //찾을 값
    int result = Arrays.binarySearch(array, key);
    //result에 key값의 인덱스 반환
}
```

---

## ✔ Math

```java
import java.lang.Math;
```

**💡 절대값 반환**

```java
Math.abs(값);
```

**💡 랜덤값**

0.0~1.0 사이의 임의의 double형 데이터를 반환

```java
Math.random() * 10; //0~9
Math.random() * 100; //0~99
Math.random() * 1000; //0~999
```

**💡 최댓값 최솟값**

```java
Math.max(a,b);
Math.min(a,b);
```

**💡 반올림 (소수점 첫째자리)**

```java
Math.round(double a);
```

**💡 올림, 내림**

```java
Math.floor(a); //내림
Math.ceil(a); //올림
```

**💡 제곱연산**

```java
Math.pow(5,2); //25
```

**💡 제곱근**

```java
Math.sqrt(a);
```




 

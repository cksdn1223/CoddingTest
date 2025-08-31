ArrayList
list 기본 10개 add 하면 10개씩 자동 추가
add(index, e) , set(index, e)
        [Java, Spring, MyBatis]
        list.add(2,"Oracle");
        [Java, Spring, Oracle, MyBatis]
        list.set(3,"Mybatis");
        [Java, Spring, Oracle, Mybatis]
remove("Mybatis");
왼쪽부터 찾아서 처음 삭제
[Spring, Oracle, Mybatis, Mybatis, Mybatis]
[Spring, Oracle, Mybatis, Mybatis]

Vector
ArrayList와 동일한 내부구조 동기화메서드로 구성
하나의 스레드가 실행완료해야만 다른스레드 실행 가능

ArrayList 데이터의 양이 많아지면 느려짐
0 1 2 3 4
list.add(1,5); 라고 추가하면
1번 인덱스에 5추가하고 나머질 뒤로 밈
0 1 2 3 4 5 가되고
1번인덱스엔 5가들어감
원래 1번인덱스의 값은 2번인덱스로 감

linkedlist

Set

set은 인덱스가 없어서 순서가없으니 호출하는방법이 있음
        //1
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //2
        for(String s : set){
            System.out.println(s);
        }
🔹 핵심 개념: Iterator는 커서를 가지고 이동하는 구조
Iterator는 컬렉션 내부를 순차적으로 탐색하기 위한 커서 기반의 도구입니다.
내부적으로 현재 위치(커서)를 기억합니다.
next()를 호출할 때마다 커서가 다음 요소로 이동합니다.
hasNext()는 "커서 다음에 요소가 또 있는가?" 를 확인합니다.
hasNext()는 "다음 요소가 있는지" 를 확인하는 메서드
next()를 호출하면 커서가 이동해서 다음 요소를 반환
따라서 hasNext()의 결과는 매번 달라질 수 있음
(커서가 이동하면서 더 이상 요소가 없을 수도 있으니까)

2번 향상된 for문을 이용해도 된다.


Map
{홍길동=90, 변학도=80, 이몽룡=100}
System.out.println(map.getOrDefault("홍길도",0));
키 값에 홍길도가 없으면 0 을 리턴
만약 "홍길동" 이라면 90을 리턴

remove("홍길동"); >> 홍길동의 키를찾아 삭제
remove("홍길동",100); >> 홍길동 키의 값이 100 이면 삭제
현재 90이기 때문에 삭제가 되지 않음
remove("홍길동", 90); 이된다면 값이 같기 때문에 삭제



Interface ***

interface 는 new로 생성하지 않음


Queue
먼저들어간게 먼저 나온다.
( 파이프? )
한쪽방향
deque  queue를 상속 받았음
앞으로들어가서 앞 뒤로들어가서 뒤
다 나올수있음

queue deqque 는 linkedlist implements

Queue 는 인터페이스

Queue 메서드
add     - 맨끝에 추가 / 꽉차면 error
offer   - 맨끝에 추가 / 꽉차면 return false
peek    - 맨앞 객체하나를 가져옴. / queue 에서 삭제안함
poll    - 객체 하나를 가져오면서 queue 에서 삭제
remove  - 객체를 삭제합니다. Element로 삭제

Deque 메서드 (Queue 메서드에 first, last)
addFirst    - 맨 앞 추가
addLast     - 맨 뒤 추가
peekFirst   - 맨 앞 가져오기
peekLast    - 맨 뒤 가져오기
pollFirst   - 맨 앞 가져오고 삭제 후 리턴
pollLast    - 맨 뒤 가져오고 삭제 후 리턴

PriorityQueue(우선순위큐)
PriorityQueue<Integer> pq = new PriorityQueue<>();  // 오름차순
1, 10, 8, 17, 25, 16, 7
순으로 값을 add 하면
        1
    10      8
   17  25 16  7
   두개씩 나눠 같는다.
   삼각형으로 비교해서 작은수가 있으면 부모랑 바꾼다.
        1
    10      7
   17  25 16  8
이러면 8과 7의 위치가 바뀐다. 7이 부모인 8보다 크기 때문에
다 바꾸고 위에서부터 출력하게 된다.
1 10 7 17 25 16 8 이된다.
[1, 10, 7, 17, 25, 16, 8]

PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());   // 내림차순
내림차 순이면 위에거랑 반대로 큰거부터 정렬한다.
그러므로 자식이 부모보다 크면 바꾼다
[25, 17, 16, 1, 10, 8, 7]

-------
Arrays.sort(배열);
배열을 정렬한다.

Arrays.fill(a,b);
a에 b로 채운다.

배열로 큐 구현하기
필요 필드
큐, 최대 용량, 데이터 수, 배열 맨앞 커서, 배열 맨뒤 커서
add(1), peek(2), poll(3), clear(4), print(5), exit(0)


-----------------


Stack

LIFO 자료구조를 구현한 클래스
Last In First Out

push - 집어넣은 element를 return
add - 들어갔는지 boolean return
add(index, e) 인덱스에 추가

peek()  - 맨위 가져옴 제거 안함
pop()   - 맨위 가져옴 제거함



StringBuilder
StringBuilder sb = new StringBuilder();
sb.append() 
sb.insert()
sb.delete()


Collections.frequency(list, list.get(i));
list.get(i) 가 list 에 몇개가 있는지 return 하는 함수


알고리즘 정렬
끝나면 문제만
heap
정렬





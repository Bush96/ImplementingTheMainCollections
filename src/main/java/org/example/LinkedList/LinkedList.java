package org.example.LinkedList;

public class LinkedList {
    public Node head;               //обявляем головной узел
    public int size;

    public LinkedList() {
        this.head = null;                     //по дефолту сразу ег нет он нулл
        this.size = 0;
    }

    public void addNode(int number) {
        Node newNode = new Node();       //при добавление создаем узел с инфой в нем
        newNode.number = number;                 //полю намбер присваиваем полученное значение
        Node currentNode = head;                 //ставим указатель текущего узла на голову списка

        if (head == null) {                     //если в списке голова ровна нулу значит он пуст и наш новый узел будет первым и равен голове
            head = newNode;                  //присваиваем это
            head.next = null;
            size = 1;
        } else {
            while (currentNode.next != null) {           //здесь мы ищем узел который равен нулу чтобы назначить в его место наш новый узел
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;                //найдя нуловый узел мы присваиваем его место новому узлу
            newNode.next = null;
            size += 1;
        }
    }

    public void uploadNodeWithValue(Object number, int position) {
        Node node = new Node();
        node.number = number;
        Node currentNode = head;
        if (head != null && position <= this.size) {        //циклом находим придыдущий к нужной позиции узе и останавливаемся на нем
            for (int i = 1; i < position; i++) {
                currentNode = currentNode.next;
            }
            node.next = currentNode.next;
            currentNode.next = node;
            this.size += 1;
        } else {
            System.out.println("Exceeded the linked list size. Current Size: " + size);
        }
    }

    public void delete(int position) {
        if (position ==0 && head != null) {             //при удалении первого узла мы просто переносим ссылку головного узла на следующий
                head = head.next;
                size--;
            } else if (position <= this.size && this.head != null) {                 //удаление остальных узлов в листе
            Node currentNode = this.head;
            Node prevNode = null;
            for (int i = 0; i < position; i++) {                       //находим предыдущий узел перед нажным и меняем ссылки на новые
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
            prevNode.next = currentNode.next;
            this.size--;
        }else{
            System.out.println("No node exist at location: "+position);
        }
    }

    public void printNodes() {
        if (size < 1)
            System.out.println("There are no nodes in the linked list");
        else {
            Node current = head;
            for (int i = 0; i < size; i++) {
                System.out.println("Node " + current.number + " is at location " + i);
                current = current.next;
            }
        }
    }

    public void findNodeByObject(Object number) {
        Node node = head;
        boolean found = false;
        for ( int i = 0; i<size; i++){                     //идем циклом по листу и ищем нужный обьек в узлах
            if (node.number.equals(number)){
                found = true;
                System.out.println(number);
            }
            node = node.next;
        }
        if(!found)
            System.out.println("Item "+number+" was not found in the Linked list");
    }

    public Object findNodeByPosition(int position) {
        Node node = head;
       for ( int i = 0; i<position; i++){
           node = node.next;
       }
        return node.number;
    }

    public int getSize(){
        return size;
    }
}


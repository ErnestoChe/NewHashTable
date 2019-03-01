package com.company;

public class HashTable {
    public int size;
    public int step;
    public String [] slots;

    public HashTable(int sz, int stp)
    {
        size = sz;
        step = stp;
        slots = new String[size];
        for(int i=0; i<size; i++) slots[i] = null;
    }

    public int hashFun(String value)
    {
        // всегда возвращает корректный индекс слота
        char[] n = value.toCharArray();
        int v = 0;
        for(int i = 0; i<n.length;i++){
            v += (int)n[i];
        }
        int hash = v % size;
        return hash;
    }

    public int seekSlot(String value)
    {
        // находит индекс пустого слота для значения, или -1
        int hash = hashFun(value);
        int h = hash;

        while(slots[hash] != null){
            hash += step;
            if(h - hash > step){
                hash = -1;
                break;
            }
            if(hash >= slots.length){
                int dif = hash - slots.length;
                hash = dif;
            }
        }

        return hash;
    }

    public int put(String value)
    {
        int ind = seekSlot(value);
        if(ind != -1){
            slots[ind] = value;
        }
        // записываем значение по хэш-функции

        // возвращается индекс слота или -1
        // если из-за коллизий элемент не удаётся разместить
        return ind;
    }

    public int find(String value)
    {
        int ind = hashFun(value);
        int h = ind;
        while(slots[ind] != value){
            ind+=step;
            if(ind >= slots.length){
                int dif = ind - slots.length;
                ind = dif;
            }
            if(Math.abs(h - ind) < step){
                ind = -1;
                break;
            }
        }
        return ind;
        // находит индекс слота со значением, или -1
        //return -1;
    }
}


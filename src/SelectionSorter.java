public class SelectionSorter implements Sorter{
    private String name = "Selection Sort";
    @Override
    public int[] sort(int[] array) {
        int primaryIndex, indexOfMin, secondaryIndex;
        for(primaryIndex = 0; primaryIndex < array.length; primaryIndex++){
            indexOfMin = primaryIndex;
            for(secondaryIndex=primaryIndex; secondaryIndex < array.length; secondaryIndex++){
               if(array[secondaryIndex] < array[indexOfMin]){
                   indexOfMin = secondaryIndex;
               }
            }
            swap(array, primaryIndex, indexOfMin);
        }
        return array;
    }
    private void swap(int[] array,int primaryIndex,int indexOfMin){
        int temp = array[primaryIndex];
        array[primaryIndex] = array[indexOfMin];
        array[indexOfMin] = temp;
    }
    @Override
    public String name(){
        return this.name;
    }
}

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return cards.isEmpty() ? Set.of() : new HashSet(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }
    // verifica se existem cartas nas coleções que podem ser trocadas
    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if(myCollection.isEmpty() || theirCollection.isEmpty()) return false;
        if(myCollection.containsAll(theirCollection)) return false;
        String[] myCollectionArray = myCollection.toArray(new String[myCollection.size()]);
        String[] theirCollectionArray = theirCollection.toArray(new String[theirCollection.size()]);
        return Arrays.mismatch(myCollectionArray, theirCollectionArray) != -1;

        
    }
    // retorna somente as cartas que estão em todas as coleções
    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> intersecao = new HashSet<>(collections.get(0));

        for (Set<String> collection : collections) intersecao.retainAll(collection);
        
        return intersecao;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> resultCollection = new HashSet<>();

        for (Set<String> collection : collections) {
          resultCollection.addAll(collection);
        }

        return resultCollection;
    }
}


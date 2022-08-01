# Haking-Weeks_Team3
I Potenti!!!!!!
1. Scrivere un'interfaccia SortableSequence<T> dove T è un tipo di dato generico. L'interfaccia
ha i seguenti metodi:
- sort(): Effettua il sorting in-place degli elementi contenuti. Per in-place si intende che non
bisogna ritornare una nuova struttura con gli elementi ordinati ma va modificata la struttura
originale.
- isSorted(): Ritorna vero se gli elementi contenuti nella struttura sono ordinati, falso altrimenti.
2. Implementare una classe SortableArray<T> dove T è un tipo di dato generico.
Questa classe rappresenta un array la cui dimensione è passata al costruttore ed i cui valori
sono inizialmente uguali a 0.
La classe deve implementare SortableSequence, senza fare uso delle librerie Standard di java
per l'ordinamento.
La classe deve anche avere i seguenti metodi:
- set(int i, T element): Inserisce l'elemento passato come parametro all'array nell'indice i.
- remove(int i): Rimuove l'elemento all'indice i nell'array.
3. Implementare una classe Game che rappresenta una partita ad un gioco. Essa deve
contenere due attributi:
- enemies: numero di nemici affrontati
- score: punteggio ottenuto
Ed un metodo:
- getFinalScore(): ritorna il prodotto fra enemies e score
Questa classe deve implementare Comparable. Un oggetto Game ha un valore maggiore di un
altro se il suo final score è maggiore di quello dell'oggetto con cui lo si confronta.
4. Implementare un'enumerazione League. Ogni lega è rappresentata da un punteggio minimo
ed uno massimo. L'enumerazione deve anche fornire due metodi:
- isPromotable(Player p): Ritorna vero se il giocatore ha un punteggio maggiore del massimo.
- isDemotable(Player p): Ritorna vero se il giocatore ha un punteggio minore del minimo.
Il numero delle leghe da registrare è arbitrario, con un minimo di 3 leghe.
5. Implementare una classe Player che rappresenta un giocatore. Ogni giocatore ha un nome,
una lista di partite giocate ed una lega di appartenenza.
La classe Player deve fornire anche un metodo getAverageScore() che ritorna il punteggio
medio ottenuto nelle sue partite.
Questa classe deve implementare Comparable. Un oggetto Player ha un valore maggiore di un
altro se il suo punteggio medio è maggiore di quello dell'oggetto con cui lo si confronta.
6. Implementare una classe Main, con un metodo main che:
- Inizializza una lista di 100 Player, assegnando ad essi dati casuali
- Corregge la lega di ogni giocatore, se necessario, in base al suo punteggio medio.
- Crea un SortableArray per ogni lega, contenente tutti i giocatori appartenenti a quella lega,
ordinandolo.
Bonus: Scrivere unit test per il codice implementato
Per la valutazione verrà dato peso ai seguenti punti:
- Utilizzo corretto di git e gestione del repository
- Correttezza e qualità del codice prodotto
- Comunicazione ed organizzazione del team
La scrittura di test, sebbene opzionale, è incoraggiata anche durante lo sviluppo per assicurarsi
che il codice prodotto sia corretto

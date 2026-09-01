class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        for(List<String> ticket: tickets){
            String from = ticket.get(0);
            String to = ticket.get(1);
            graph.computeIfAbsent(from, k -> new PriorityQueue<>()).add(to);
        }
        LinkedList<String> itinerary = new LinkedList<>();
        dfs("JFK", graph, itinerary);
        return itinerary;
    }
    private void dfs(String airport, Map<String, PriorityQueue<String>> graph, LinkedList<String> itinerary){
        PriorityQueue<String> destination = graph.get(airport);
        while(destination != null && !destination.isEmpty()){
            String nest = destination.poll();
            dfs(nest, graph, itinerary);
        }
        itinerary.addFirst(airport);
    } 
}
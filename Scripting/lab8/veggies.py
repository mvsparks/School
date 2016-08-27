#!/usr/bin/python
import pickle

# simple example to demonstrate how the pickle module works

veggies = {'tomato':1.5, 'cucumber': 2, 'radish':15}
fp = open("temp.txt", 'w')
pickle.dump(veggies, fp)
fp.close()
print 'veggies have beeen pickled, loading...'
fq = open("temp.txt")
salad = pickle.load(fq)
print 'after loading from file, salad contains:\n', salad
fq.close()

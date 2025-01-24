
import threading
import time

def worker():
    print("Worker thread started.")
    time.sleep(1)
    print("Worker thread finished." + threading.currentThread().name)

# create a thread to run

threads = []

for i in range(5):
    t = threading.Thread(target=worker)
    t.start()
    threads.append(t)
    # t.join()

for t in threads:
    t.join()

print("Main thread started.")
# time.sleep(3)
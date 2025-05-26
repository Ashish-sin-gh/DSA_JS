class HashTable {
  constructor(size) {
    this.table = new Array(size);
    this.size = size;
  }

  //logic for change key to an index for storing it against the array index
  hash(key) {
    let hashedkey = 0;
    for (let i = 0; i < key.length; i++) {
      //   console.log(key.charCodeAt(i));
      hashedkey += key.charCodeAt(i);
    }
    return hashedkey % this.size;
  }

  set(key, value) {
    let keyhashed = Number(this.hash(key));
    this.table[keyhashed] = value;
    // console.log(keyhashed);
  }

  get(key) {
    let keyhashed = this.hash(key);
    return `${key}: ${this.table[keyhashed]}`;
  }

  remove(key) {
    let keyhashed = this.hash(key);
    this.table[keyhashed] = undefined;
  }

  display() {
    for (let i = 0; i < this.table.length; i++) {
      //   console.log("dfdf");
      if (this.table[i]) {
        console.log(i, this.table[i]);
      }
    }
  }
}

const hashtable = new HashTable(10);

hashtable.set("ashish", 26);
hashtable.set("harshita", 26);
hashtable.set("ankita", 29);
hashtable.set("kiran", 55);

hashtable.display();

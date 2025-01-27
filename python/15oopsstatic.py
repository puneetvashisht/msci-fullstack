class BankAccount:
    interest_rate = 0.05  # Class-level data

    def __init__(self, owner, balance):
        self.owner = owner
        self.balance = balance

    def __str__(self):
        return f"{self.owner}'s account with balance: ${self.balance:.2f}"

    @classmethod
    def set_interest_rate(cls, new_rate):
        cls.interest_rate = new_rate

    @staticmethod
    def is_valid_amount(amount):
        return amount > 0

    def apply_interest(self):
        self.balance += self.balance * self.interest_rate

# Usage
account = BankAccount("Alice", 1000)
print(account)  # Output: Alice's account with balance: $1000.00

account.apply_interest()
print(account)  # Output: Alice's account with balance: $1050.00

BankAccount.set_interest_rate(0.1)
account.apply_interest()
print(account)  # Output: Alice's account with balance: $1155.00

def binary_search(books, target):
    left = 0
    right = len(books) - 1

    while left <= right:
        mid = (left + right) // 2

        if books[mid] == target:
            return mid  # Found
        elif books[mid] < target:
            left = mid + 1
        else:
            right = mid - 1

    return -1  # Not found


def main():
    # Sample sorted book IDs
    book_ids = [101, 203, 304, 405, 506, 607, 708, 809]
    print("Available Book IDs:", book_ids)

    # Take input from user
    target_id = int(input("Enter Book ID to search: "))

    # Perform binary search
    index = binary_search(book_ids, target_id)

    if index != -1:
        print(f"Book with ID {target_id} found at index {index}.")
    else:
        print(f"Book with ID {target_id} not found.")


if _name_ == "_main_":
    main()
def bookShop(books, money, prices, pages):
    pagesPrice = []
    for m in range(books+1):
        pagesPrice.append([])
        for n in range(money+1):
            pagesPrice[m].append(0)
    
    for i in range(books):
        for j in range(money+1):
            pagesPrice[i+1][j] = pagesPrice[i][j]
            if prices[i] <= j:
                pagesPrice[i+1][j] = max(pagesPrice[i+1][j], (pages[i]+pagesPrice[i][j-prices[i]]))

    print (pagesPrice[books][money])

books = input()
money = input()
prices = []
for i in range(books):
    prices.append(input())
pages = []
for i in range(books):
    pages.append(input())
bookShop(books,money,prices,pages)
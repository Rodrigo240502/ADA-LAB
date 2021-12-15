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

books = int(input("Ingrese la cantidad de libros: "))
money = int(input("Ingrese el dinero que posea: "))
prices = []
for i in range(books):
    prices.append(int(input("Ingrese el precio del libro ")))
pages = []
for i in range(books):
    pages.append(int(input("Ingrese la cantidad de paginas del libro ")))
print(prices)
print(pages)
bookShop(books,money,prices,pages)
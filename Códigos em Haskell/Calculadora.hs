soma x y = x+y
subtracao x y = x-y
multiplicacao x y = x*y
divisao x y = x/y

main = do
  putStrLn "Calculadora Simples"
  putStrLn "Digite um número: "
  n1 <- readLn :: IO Float
  putStrLn "Digite outro número :"
  n2 <- readLn :: IO Float
  putStrLn ""
  putStrLn ("A soma é: " ++ show(soma n1 n2))
  putStrLn ("A subtração é: " ++ show(subtracao n1 n2))
  putStrLn("A multiplicação é: " ++ show(multiplicacao n1 n2))
  putStrLn ("A divisão é: " ++ show(divisao n1 n2))

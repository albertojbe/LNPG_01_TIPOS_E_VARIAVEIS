conversor x = (x * (9/5)) + 32

main = do
  putStrLn "Conversor de Temperatura"
  putStrLn "Digite uma temperatura em Celsius: "
  n1 <- readLn :: IO Float
  
  putStrLn ""
  putStrLn ("Essa temperatura em Farenheit é: " ++ show(conversor n1)++"°F")
  

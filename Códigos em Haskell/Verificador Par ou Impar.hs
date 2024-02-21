main = do
  putStrLn "Verificador de Par ou Impar"
  putStrLn ""
  putStrLn "Digite um numero: "
  numero <- readLn :: IO Int
  putStrLn ""
  if even numero 
        then putStrLn "O número é par"
        else putStrLn "O número é impar"
  
  

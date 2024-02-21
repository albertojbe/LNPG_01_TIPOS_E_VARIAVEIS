maioridade x = if x >= 18 then "Voce e maior de idade" else "Voce e menor de idade"

main = do
  putStrLn "Verificador de Maioridade"
  putStrLn ""
  putStrLn "Digite sua idade: "
  idade <- readLn :: IO Float
  putStrLn ""
  putStrLn (show(maioridade idade))
  
  

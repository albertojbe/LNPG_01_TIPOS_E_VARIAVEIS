media_ponderada x y z a b c = ((x*a) + (y*b) + (z*c)) / (a+b+c)

main = do
  putStrLn "Media Ponderada"
  putStrLn ""
  putStrLn "Digite três notas: "
  n1 <- readLn :: IO Float
  n2 <- readLn :: IO Float
  n3 <- readLn :: IO Float
  putStrLn "Agora digite seus respectivos pesos: "
  p1 <- readLn :: IO Float
  p2 <- readLn :: IO Float
  p3 <- readLn :: IO Float
  
  putStrLn ""
  putStrLn ("A média ponderada é: " ++ show(media_ponderada n1 n2 n3 p1 p2 p3))
  

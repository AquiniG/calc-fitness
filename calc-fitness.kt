fun main() {

    // ===== Dados da Pessoa 1 =====

    val nome1 = "Henrique"
    val idade1 = 24
    val pesoKg1 = 75.0
    val alturaM1 = 1.75
    val metaPesoKg1 = 72.0

    // ===== Dados da Pessoa 2 =====

    val nome2 = "Adriano"
    val idade2 = 30
    val pesoKg2 = 88.0
    val alturaM2 = 1.80

    // ===== Cálculos - Pessoa 1 =====

    val imc1 = pesoKg1 / (alturaM1 * alturaM1)
    val diferencaParaMeta1 = pesoKg1 - metaPesoKg1
    val caloriasEstimadas1 =  pesoKg1 * 24

    // ===== Operadores Relacionais =====

    val estaAcimaDoPeso1 = imc1 > 25.0
    val bateuAMeta1 = pesoKg1 <= metaPesoKg1

    // ===== Operadores Lógicos =====

    val estaEmFaixaSaudavel1 = imc1 >= 18.5 && imc1 <= 24.9
    val precisaAtencao1 = imc1 > 30.0 && idade1 > 50
    val situacaoOk1 = estaEmFaixaSaudavel1 || bateuAMeta1

    // ===== Comparando as Pessoas =====

    val diferencaIdade = idade1 - idade2
    val mesmaFaixaEtaria = diferencaIdade <= 5 && diferencaIdade >= -5

    // ===== SAÍDA =====

    println("=== Perfil de $nome1 ===")
    println()
    println("IMC: $imc1")
    println("Diferenca para meta: $diferencaParaMeta1 kg")
    println("Calorias estimadas: $caloriasEstimadas1")
    println("Esta acima do peso? $estaAcimaDoPeso1")
    println("Bateu a meta? $bateuAMeta1")
    println("Esta em faixa saudavel? $estaEmFaixaSaudavel1")
    println("Precisa de atencao redobrada? $precisaAtencao1")
    println("Situacao OK? $situacaoOk1")
    println()
    println("Mesa faixa etaria que $nome2? $mesmaFaixaEtaria")


}
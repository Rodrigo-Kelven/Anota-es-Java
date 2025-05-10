#!/bin/bash

# Atualizar os repositórios e pacotes
echo "Atualizando pacotes..."
sudo apt update -y && sudo apt upgrade -y

# Instalar o OpenJDK 17
echo "Instalando OpenJDK 17..."
sudo apt install openjdk-17-jdk -y

# Verificar a instalação do Java
echo "Verificando a instalação do Java..."
java -version

# Configurar JAVA_HOME
JAVA_PATH=$(sudo update-alternatives --config java | grep -oP "(?<=/usr/lib/jvm/).*(?=/bin/java)" | head -n 1)

if [ -z "$JAVA_PATH" ]; then
    echo "Não foi possível determinar o caminho do Java. Abortando."
    exit 1
fi

echo "Configurando JAVA_HOME..."
echo "export JAVA_HOME=/usr/lib/jvm/$JAVA_PATH" | sudo tee -a /etc/profile.d/java.sh > /dev/null
echo "export PATH=\$JAVA_HOME/bin:\$PATH" | sudo tee -a /etc/profile.d/java.sh > /dev/null

# Carregar a variável JAVA_HOME
source /etc/profile.d/java.sh

# Verificar se o JAVA_HOME foi configurado corretamente
echo "Verificando a variável JAVA_HOME..."
echo $JAVA_HOME

# Exibir mensagem final
echo "Instalação do Java concluída com sucesso!"

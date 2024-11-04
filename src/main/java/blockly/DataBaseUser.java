package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class DataBaseUser {

public static final int TIMEOUT = 300;

/**
 *
 * @author Leandro Leonardo Assarice
 * @since 31/10/2024, 15:44:19
 *
 */
public static void Executar() throws Exception {
  new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    cronapi.database.Operations.beginTransaction(Var.valueOf("app"));
    item =
    cronapi.database.Operations.executeNativeQueryUpdate(Var.valueOf("app.entity.User"),Var.valueOf("DELETE FROM USER WHERE id <> \'1d4e5d7b-dca8-4a1d-90fd-72648cf5dc8d\';\nINSERT INTO USER (ID, ACCESS_FAILED_COUNT, EMAIL, EMAIL_CONFIRMED, LOCKOUT_ENABLED, LOCKOUT_END, NAME, NORMALIZED_EMAIL, NORMALIZED_USER_NAME, PASSWORD, PHONE_NUMBER, PHONE_NUMBER_CONFIRMED, PICTURE, SECURITY_STAMP, THEME, TWO_FACTOR_ENABLED, USER_NAME)\nVALUES \n(12345678923, 0, \'david@teste.io\', 1, 0, \'2016-09-06 14:41:05.0+00\', \'David Costa\', \'david@teste.io\', \'David\',\'123123\',\'\',1,\'\',\'123\',\'\',1,\'David Costa\'),\n(98765432112, 1, \'ana@teste.io\', 0, 1, \'2017-01-15 10:23:45.0+00\', \'Ana Silva\', \'ana@teste.io\', \'Ana\',\'456456\',\'\',0,\'\',\'456\',\'\',0,\'Ana Silva\'),\n(45678912345, 0, \'bruno@teste.io\', 1, 0, \'2018-03-21 16:54:32.0+00\', \'Bruno Santos\', \'bruno@teste.io\', \'Bruno\',\'789789\',\'\',1,\'\',\'789\',\'\',1,\'Bruno Santos\'),\n(65432198765, 1, \'carla@teste.io\', 0, 1, \'2019-05-12 12:34:56.0+00\', \'Carla Ferreira\', \'carla@teste.io\', \'Carla\',\'101010\',\'\',0,\'\',\'101\',\'\',0,\'Carla Ferreira\'),\n(32198765498, 0, \'diego@teste.io\', 1, 0, \'2020-07-04 18:45:21.0+00\', \'Diego Ribeiro\', \'diego@teste.io\', \'Diego\',\'121212\',\'\',1,\'\',\'121\',\'\',1,\'Diego Ribeiro\'),\n(78912345678, 1, \'eduarda@teste.io\', 0, 1, \'2021-08-25 14:15:37.0+00\', \'Eduarda Souza\', \'eduarda@teste.io\', \'Eduarda\',\'131313\',\'\',0,\'\',\'131\',\'\',0,\'Eduarda Souza\'),\n(14725836985, 0, \'fabio@teste.io\', 1, 0, \'2022-10-16 20:16:48.0+00\', \'Fabio Almeida\', \'fabio@teste.io\', \'Fabio\',\'141414\',\'\',1,\'\',\'141\',\'\',1,\'Fabio Almeida\'),\n(25836914736, 1, \'gabriela@teste.io\', 0, 1, \'2023-11-07 22:17:59.0+00\', \'Gabriela Lima\', \'gabriela@teste.io\', \'Gabriela\',\'151515\',\'\',0,\'\',\'151\',\'\',0,\'Gabriela Lima\'),\n(36914725847, 0, \'henrique@teste.io\', 1, 0, \'2024-12-29 23:18:10.0+00\', \'Henrique Gomes\', \'henrique@teste.io\', \'Henrique\',\'161616\',\'\',1,\'\',\'161\',\'\',1,\'Henrique Gomes\'),\n(74185296314, 1, \'isabela@teste.io\', 0, 1, \'2025-02-10 01:19:21.0+00\', \'Isabela Martins\', \'isabela@teste.io\', \'Isabela\',\'171717\',\'\',0,\'\',\'171\',\'\',0,\'Isabela Martins\'),\n(85296374125, 0, \'joao@teste.io\', 1, 0, \'2026-03-22 03:20:32.0+00\', \'Joao Pereira\', \'joao@teste.io\', \'Joao\',\'181818\',\'\',1,\'\',\'181\',\'\',1,\'Joao Pereira\'),\n(96374185236, 1, \'karina@teste.io\', 0, 1, \'2027-04-13 05:21:43.0+00\', \'Karina Oliveira\', \'karina@teste.io\', \'Karina\',\'191919\',\'\',0,\'\',\'191\',\'\',0,\'Karina Oliveira\'),\n(15935748624, 0, \'lucas@teste.io\', 1, 0, \'2028-05-25 07:22:54.0+00\', \'Lucas Costa\', \'lucas@teste.io\', \'Lucas\',\'202020\',\'\',1,\'\',\'202\',\'\',1,\'Lucas Costa\'),\n(35748615942, 1, \'mariana@teste.io\', 0, 1, \'2029-06-16 09:24:05.0+00\', \'Mariana Silva\', \'mariana@teste.io\', \'Mariana\',\'212121\',\'\',0,\'\',\'212\',\'\',0,\'Mariana Silva\'),\n(48615935753, 0, \'nelson@teste.io\', 1, 0, \'2030-07-28 11:25:16.0+00\', \'Nelson Santos\', \'nelson@teste.io\', \'Nelson\',\'222222\',\'\',1,\'\',\'222\',\'\',1,\'Nelson Santos\'),\n(95175382468, 1, \'olivia@teste.io\', 0, 1, \'2031-08-19 13:26:27.0+00\', \'Olivia Ferreira\', \'olivia@teste.io\', \'Olivia\',\'232323\',\'\',0,\'\',\'232\',\'\',0,\'Olivia Ferreira\'),\n(75382495179, 0, \'paulo@teste.io\', 1, 0, \'2032-09-30 15:27:38.0+00\', \'Paulo Ribeiro\', \'paulo@teste.io\', \'Paulo\',\'242424\',\'\',1,\'\',\'242\',\'\',1,\'Paulo Ribeiro\'),\n(82495175381, 1, \'renata@teste.io\', 0, 1, \'2033-10-22 17:28:49.0+00\', \'Renata Souza\', \'renata@teste.io\', \'Renata\',\'252525\',\'\',0,\'\',\'252\',\'\',0,\'Renata Souza\'),\n(35795124682, 0, \'sergio@teste.io\', 1, 0, \'2034-11-13 19:30:00.0+00\', \'Sergio Almeida\', \'sergio@teste.io\', \'Sergio\',\'262626\',\'\',1,\'\',\'262\',\'\',1,\'Sergio Almeida\'),\n(95135746823, 1, \'tatiana@teste.io\', 0, 1, \'2035-12-05 21:31:11.0+00\', \'Tatiana Lima\', \'tatiana@teste.io\', \'Tatiana\',\'272727\',\'\',0,\'\',\'272\',\'\',0,\'Tatiana Lima\');"));
    cronapi.database.Operations.commitTransaction(Var.valueOf("app"));
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
    Var.valueOf("Dados populados com sucesso!"));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Leandro Leonardo Assarice
 * @since 31/10/2024, 15:44:19
 *
 */
public static void Resetar() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.beginTransaction(Var.valueOf("app"));
    cronapi.database.Operations.executeNativeQueryUpdate(Var.valueOf("app.entity.User"),Var.valueOf("DELETE FROM USER WHERE id <> \'1d4e5d7b-dca8-4a1d-90fd-72648cf5dc8d\';"));
    cronapi.database.Operations.commitTransaction(Var.valueOf("app"));
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
    Var.valueOf("Dados deletados com sucesso!"));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Leandro Leonardo Assarice
 * @since 31/10/2024, 15:44:19
 *
 */
public static void Tripulacao() throws Exception {
  new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    cronapi.database.Operations.beginTransaction(Var.valueOf("app"));
    item =
    cronapi.database.Operations.executeNativeQueryUpdate(Var.valueOf("app.entity.Tripulacao"),Var.valueOf("DELETE FROM TRIPULACAO;\nINSERT INTO TRIPULACAO(ID, TRIPULANTE , FK_TRIPULACAO_0)\nVALUES(\'60EC671A-5D93-4623-A79A-029F95E6A2D8\', \'Capitão-Jack-Sparrow\', null),\n(\'298C8086-C12A-484E-BE93-0F6CB0B8CB90\', \'Capitão-Nemo\', null),\n(\'C3A42C8C-5EB2-4047-B0FB-6553885F0424\', \'Oficial-Hook\', \'60EC671A-5D93-4623-A79A-029F95E6A2D8\'),\n(\'0248BB7D-72BA-4F80-A8FA-45914A108570\',\'Tripulante-Peter\',\'298C8086-C12A-484E-BE93-0F6CB0B8CB90\'),\n(\'2C74F5B3-45BC-4271-98E6-FD427DF14B9E\', \'Tripulante-Ahab\', \'C3A42C8C-5EB2-4047-B0FB-6553885F0424\'),\n(\'9C9C661E-CADC-4D6B-9B8A-44B10C3F9CC1\', \'Tripulante-Morgan\', \'298C8086-C12A-484E-BE93-0F6CB0B8CB90\');"));
    cronapi.database.Operations.commitTransaction(Var.valueOf("app"));
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
    Var.valueOf("Dados populados com sucesso!"));
   return Var.VAR_NULL;
   }
 }.call();
}

}


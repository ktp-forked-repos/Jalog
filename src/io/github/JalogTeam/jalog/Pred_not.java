// Pred_not.java

package io.github.JalogTeam.jalog;

import java.io.*;

public class Pred_not extends Pred
{
  public Pro_Term Arg;


  public void post_call()
  {
    forward = !forward;
    sub_activation = null;
    called_body = null;
  }
}

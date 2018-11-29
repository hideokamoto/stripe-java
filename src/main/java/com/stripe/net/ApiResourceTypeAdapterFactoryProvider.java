package com.stripe.net;

import com.google.gson.TypeAdapterFactory;
import com.stripe.model.ExternalAccountTypeAdapterFactory;
import java.util.ArrayList;
import java.util.List;

public class ApiResourceTypeAdapterFactoryProvider {
  private static final List<TypeAdapterFactory> factories = new ArrayList<>();

  static {
    factories.add(new ExternalAccountTypeAdapterFactory());
  }

  public static List<TypeAdapterFactory> getAll() {
    return factories;
  }
}

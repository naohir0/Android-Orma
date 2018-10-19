package com.github.gfx.android.orma.example.orma;

import androidx.annotation.NonNull;
import com.github.gfx.android.orma.rx.RxDeleter;
import com.github.gfx.android.orma.rx.RxOrmaConnection;
import java.util.Arrays;
import java.util.Collection;

public class Category_Deleter extends RxDeleter<Category, Category_Deleter> {
  final Category_Schema schema;

  public Category_Deleter(RxOrmaConnection conn, Category_Schema schema) {
    super(conn);
    this.schema = schema;
  }

  public Category_Deleter(Category_Deleter that) {
    super(that);
    this.schema = that.getSchema();
  }

  public Category_Deleter(Category_Relation relation) {
    super(relation);
    this.schema = relation.getSchema();
  }

  @Override
  public Category_Deleter clone() {
    return new Category_Deleter(this);
  }

  @NonNull
  @Override
  public Category_Schema getSchema() {
    return schema;
  }

  public Category_Deleter idEq(long id) {
    return where(schema.id, "=", id);
  }

  public Category_Deleter idNotEq(long id) {
    return where(schema.id, "<>", id);
  }

  public Category_Deleter idIn(@NonNull Collection<Long> values) {
    return in(false, schema.id, values);
  }

  public Category_Deleter idNotIn(@NonNull Collection<Long> values) {
    return in(true, schema.id, values);
  }

  public final Category_Deleter idIn(@NonNull Long... values) {
    return idIn(Arrays.asList(values));
  }

  public final Category_Deleter idNotIn(@NonNull Long... values) {
    return idNotIn(Arrays.asList(values));
  }

  public Category_Deleter idLt(long id) {
    return where(schema.id, "<", id);
  }

  public Category_Deleter idLe(long id) {
    return where(schema.id, "<=", id);
  }

  public Category_Deleter idGt(long id) {
    return where(schema.id, ">", id);
  }

  public Category_Deleter idGe(long id) {
    return where(schema.id, ">=", id);
  }

  /**
   * To build a condition <code>id BETWEEN a AND b</code>, which is equivalent to <code>a <= id AND id <= b</code>.
   */
  public Category_Deleter idBetween(long idA, long idB) {
    return whereBetween(schema.id, idA, idB);
  }
}

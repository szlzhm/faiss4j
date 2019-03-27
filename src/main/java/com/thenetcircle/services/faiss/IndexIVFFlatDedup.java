/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.thenetcircle.services.faiss;

public class IndexIVFFlatDedup extends IndexIVFFlat {
  private transient long swigCPtr;

  protected IndexIVFFlatDedup(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexIVFFlatDedup_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexIVFFlatDedup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_IndexIVFFlatDedup(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setInstances(SWIGTYPE_p_std__unordered_multimapT_long_long_t value) {
    swigfaissJNI.IndexIVFFlatDedup_instances_set(swigCPtr, this, SWIGTYPE_p_std__unordered_multimapT_long_long_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__unordered_multimapT_long_long_t getInstances() {
    return new SWIGTYPE_p_std__unordered_multimapT_long_long_t(swigfaissJNI.IndexIVFFlatDedup_instances_get(swigCPtr, this), true);
  }

  public IndexIVFFlatDedup(Index quantizer, long d, long nlist_, MetricType arg3) {
    this(swigfaissJNI.new_IndexIVFFlatDedup__SWIG_0(Index.getCPtr(quantizer), quantizer, d, nlist_, arg3.swigValue()), true);
  }

  public IndexIVFFlatDedup(Index quantizer, long d, long nlist_) {
    this(swigfaissJNI.new_IndexIVFFlatDedup__SWIG_1(Index.getCPtr(quantizer), quantizer, d, nlist_), true);
  }

  public void train(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexIVFFlatDedup_train(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void add_with_ids(int n, SWIGTYPE_p_float x, SWIGTYPE_p_long xids) {
    swigfaissJNI.IndexIVFFlatDedup_add_with_ids(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_long.getCPtr(xids));
  }

  public void search_preassigned(int n, SWIGTYPE_p_float x, int k, SWIGTYPE_p_long assign, SWIGTYPE_p_float centroid_dis, SWIGTYPE_p_float distances, SWIGTYPE_p_long labels, boolean store_pairs, IVFSearchParameters params) {
    swigfaissJNI.IndexIVFFlatDedup_search_preassigned__SWIG_0(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_long.getCPtr(assign), SWIGTYPE_p_float.getCPtr(centroid_dis), SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long.getCPtr(labels), store_pairs, IVFSearchParameters.getCPtr(params), params);
  }

  public void search_preassigned(int n, SWIGTYPE_p_float x, int k, SWIGTYPE_p_long assign, SWIGTYPE_p_float centroid_dis, SWIGTYPE_p_float distances, SWIGTYPE_p_long labels, boolean store_pairs) {
    swigfaissJNI.IndexIVFFlatDedup_search_preassigned__SWIG_1(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_long.getCPtr(assign), SWIGTYPE_p_float.getCPtr(centroid_dis), SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long.getCPtr(labels), store_pairs);
  }

  public int remove_ids(IDSelector sel) {
    return swigfaissJNI.IndexIVFFlatDedup_remove_ids(swigCPtr, this, IDSelector.getCPtr(sel), sel);
  }

  public void range_search(int n, SWIGTYPE_p_float x, float radius, RangeSearchResult result) {
    swigfaissJNI.IndexIVFFlatDedup_range_search(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), radius, RangeSearchResult.getCPtr(result), result);
  }

  public void update_vectors(int nv, SWIGTYPE_p_long idx, SWIGTYPE_p_float v) {
    swigfaissJNI.IndexIVFFlatDedup_update_vectors(swigCPtr, this, nv, SWIGTYPE_p_long.getCPtr(idx), SWIGTYPE_p_float.getCPtr(v));
  }

  public void reconstruct_from_offset(int list_no, int offset, SWIGTYPE_p_float recons) {
    swigfaissJNI.IndexIVFFlatDedup_reconstruct_from_offset(swigCPtr, this, list_no, offset, SWIGTYPE_p_float.getCPtr(recons));
  }

  public IndexIVFFlatDedup() {
    this(swigfaissJNI.new_IndexIVFFlatDedup__SWIG_2(), true);
  }

}

/* First created by JCasGen Wed Sep 11 14:28:35 EDT 2013 */
package uima;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** This kind of type is to evaluate the precision of the results
 * Updated by JCasGen Wed Sep 11 22:12:53 EDT 2013
 * @generated */
public class Evaluation_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Evaluation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Evaluation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Evaluation(addr, Evaluation_Type.this);
  			   Evaluation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Evaluation(addr, Evaluation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Evaluation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("uima.Evaluation");
 
  /** @generated */
  final Feature casFeat_baseAnnotation;
  /** @generated */
  final int     casFeatCode_baseAnnotation;
  /** @generated */ 
  public int getBaseAnnotation(int addr) {
        if (featOkTst && casFeat_baseAnnotation == null)
      jcas.throwFeatMissing("baseAnnotation", "uima.Evaluation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_baseAnnotation);
  }
  /** @generated */    
  public void setBaseAnnotation(int addr, int v) {
        if (featOkTst && casFeat_baseAnnotation == null)
      jcas.throwFeatMissing("baseAnnotation", "uima.Evaluation");
    ll_cas.ll_setRefValue(addr, casFeatCode_baseAnnotation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_precistionN;
  /** @generated */
  final int     casFeatCode_precistionN;
  /** @generated */ 
  public int getPrecistionN(int addr) {
        if (featOkTst && casFeat_precistionN == null)
      jcas.throwFeatMissing("precistionN", "uima.Evaluation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_precistionN);
  }
  /** @generated */    
  public void setPrecistionN(int addr, int v) {
        if (featOkTst && casFeat_precistionN == null)
      jcas.throwFeatMissing("precistionN", "uima.Evaluation");
    ll_cas.ll_setIntValue(addr, casFeatCode_precistionN, v);}
    
  
 
  /** @generated */
  final Feature casFeat_precisionScore;
  /** @generated */
  final int     casFeatCode_precisionScore;
  /** @generated */ 
  public double getPrecisionScore(int addr) {
        if (featOkTst && casFeat_precisionScore == null)
      jcas.throwFeatMissing("precisionScore", "uima.Evaluation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_precisionScore);
  }
  /** @generated */    
  public void setPrecisionScore(int addr, double v) {
        if (featOkTst && casFeat_precisionScore == null)
      jcas.throwFeatMissing("precisionScore", "uima.Evaluation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_precisionScore, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Evaluation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_baseAnnotation = jcas.getRequiredFeatureDE(casType, "baseAnnotation", "uima.BaseAnnotationType", featOkTst);
    casFeatCode_baseAnnotation  = (null == casFeat_baseAnnotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_baseAnnotation).getCode();

 
    casFeat_precistionN = jcas.getRequiredFeatureDE(casType, "precistionN", "uima.cas.Integer", featOkTst);
    casFeatCode_precistionN  = (null == casFeat_precistionN) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precistionN).getCode();

 
    casFeat_precisionScore = jcas.getRequiredFeatureDE(casType, "precisionScore", "uima.cas.Double", featOkTst);
    casFeatCode_precisionScore  = (null == casFeat_precisionScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precisionScore).getCode();

  }
}



    
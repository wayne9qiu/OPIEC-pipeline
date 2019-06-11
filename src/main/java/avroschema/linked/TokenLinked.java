/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avroschema.linked;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TokenLinked extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TokenLinked\",\"namespace\":\"avroschema.linked\",\"fields\":[{\"name\":\"pos\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"ner\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"span\",\"type\":{\"type\":\"record\",\"name\":\"Span\",\"fields\":[{\"name\":\"start_index\",\"type\":[\"int\",\"null\"]},{\"name\":\"end_index\",\"type\":[\"int\",\"null\"]}]}},{\"name\":\"lemma\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"word\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"index\",\"type\":[\"int\",\"null\"]},{\"name\":\"w_link\",\"type\":{\"type\":\"record\",\"name\":\"WikiLink\",\"fields\":[{\"name\":\"offset_begin_ind\",\"type\":\"int\"},{\"name\":\"offset_end_ind\",\"type\":\"int\"},{\"name\":\"phrase\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"wiki_link\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String pos;
  @Deprecated public java.lang.String ner;
  @Deprecated public avroschema.linked.Span span;
  @Deprecated public java.lang.String lemma;
  @Deprecated public java.lang.String word;
  @Deprecated public java.lang.Integer index;
  @Deprecated public avroschema.linked.WikiLink w_link;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public TokenLinked() {}

  /**
   * All-args constructor.
   */
  public TokenLinked(java.lang.String pos, java.lang.String ner, avroschema.linked.Span span, java.lang.String lemma, java.lang.String word, java.lang.Integer index, avroschema.linked.WikiLink w_link) {
    this.pos = pos;
    this.ner = ner;
    this.span = span;
    this.lemma = lemma;
    this.word = word;
    this.index = index;
    this.w_link = w_link;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return pos;
    case 1: return ner;
    case 2: return span;
    case 3: return lemma;
    case 4: return word;
    case 5: return index;
    case 6: return w_link;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: pos = (java.lang.String)value$; break;
    case 1: ner = (java.lang.String)value$; break;
    case 2: span = (avroschema.linked.Span)value$; break;
    case 3: lemma = (java.lang.String)value$; break;
    case 4: word = (java.lang.String)value$; break;
    case 5: index = (java.lang.Integer)value$; break;
    case 6: w_link = (avroschema.linked.WikiLink)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'pos' field.
   */
  public java.lang.String getPos() {
    return pos;
  }

  /**
   * Sets the value of the 'pos' field.
   * @param value the value to set.
   */
  public void setPos(java.lang.String value) {
    this.pos = value;
  }

  /**
   * Gets the value of the 'ner' field.
   */
  public java.lang.String getNer() {
    return ner;
  }

  /**
   * Sets the value of the 'ner' field.
   * @param value the value to set.
   */
  public void setNer(java.lang.String value) {
    this.ner = value;
  }

  /**
   * Gets the value of the 'span' field.
   */
  public avroschema.linked.Span getSpan() {
    return span;
  }

  /**
   * Sets the value of the 'span' field.
   * @param value the value to set.
   */
  public void setSpan(avroschema.linked.Span value) {
    this.span = value;
  }

  /**
   * Gets the value of the 'lemma' field.
   */
  public java.lang.String getLemma() {
    return lemma;
  }

  /**
   * Sets the value of the 'lemma' field.
   * @param value the value to set.
   */
  public void setLemma(java.lang.String value) {
    this.lemma = value;
  }

  /**
   * Gets the value of the 'word' field.
   */
  public java.lang.String getWord() {
    return word;
  }

  /**
   * Sets the value of the 'word' field.
   * @param value the value to set.
   */
  public void setWord(java.lang.String value) {
    this.word = value;
  }

  /**
   * Gets the value of the 'index' field.
   */
  public java.lang.Integer getIndex() {
    return index;
  }

  /**
   * Sets the value of the 'index' field.
   * @param value the value to set.
   */
  public void setIndex(java.lang.Integer value) {
    this.index = value;
  }

  /**
   * Gets the value of the 'w_link' field.
   */
  public avroschema.linked.WikiLink getWLink() {
    return w_link;
  }

  /**
   * Sets the value of the 'w_link' field.
   * @param value the value to set.
   */
  public void setWLink(avroschema.linked.WikiLink value) {
    this.w_link = value;
  }

  /** Creates a new TokenLinked RecordBuilder */
  public static avroschema.linked.TokenLinked.Builder newBuilder() {
    return new avroschema.linked.TokenLinked.Builder();
  }
  
  /** Creates a new TokenLinked RecordBuilder by copying an existing Builder */
  public static avroschema.linked.TokenLinked.Builder newBuilder(avroschema.linked.TokenLinked.Builder other) {
    return new avroschema.linked.TokenLinked.Builder(other);
  }
  
  /** Creates a new TokenLinked RecordBuilder by copying an existing TokenLinked instance */
  public static avroschema.linked.TokenLinked.Builder newBuilder(avroschema.linked.TokenLinked other) {
    return new avroschema.linked.TokenLinked.Builder(other);
  }
  
  /**
   * RecordBuilder for TokenLinked instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TokenLinked>
    implements org.apache.avro.data.RecordBuilder<TokenLinked> {

    private java.lang.String pos;
    private java.lang.String ner;
    private avroschema.linked.Span span;
    private java.lang.String lemma;
    private java.lang.String word;
    private java.lang.Integer index;
    private avroschema.linked.WikiLink w_link;

    /** Creates a new Builder */
    private Builder() {
      super(avroschema.linked.TokenLinked.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avroschema.linked.TokenLinked.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.pos)) {
        this.pos = data().deepCopy(fields()[0].schema(), other.pos);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ner)) {
        this.ner = data().deepCopy(fields()[1].schema(), other.ner);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.span)) {
        this.span = data().deepCopy(fields()[2].schema(), other.span);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.lemma)) {
        this.lemma = data().deepCopy(fields()[3].schema(), other.lemma);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.word)) {
        this.word = data().deepCopy(fields()[4].schema(), other.word);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.index)) {
        this.index = data().deepCopy(fields()[5].schema(), other.index);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.w_link)) {
        this.w_link = data().deepCopy(fields()[6].schema(), other.w_link);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing TokenLinked instance */
    private Builder(avroschema.linked.TokenLinked other) {
            super(avroschema.linked.TokenLinked.SCHEMA$);
      if (isValidValue(fields()[0], other.pos)) {
        this.pos = data().deepCopy(fields()[0].schema(), other.pos);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ner)) {
        this.ner = data().deepCopy(fields()[1].schema(), other.ner);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.span)) {
        this.span = data().deepCopy(fields()[2].schema(), other.span);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.lemma)) {
        this.lemma = data().deepCopy(fields()[3].schema(), other.lemma);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.word)) {
        this.word = data().deepCopy(fields()[4].schema(), other.word);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.index)) {
        this.index = data().deepCopy(fields()[5].schema(), other.index);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.w_link)) {
        this.w_link = data().deepCopy(fields()[6].schema(), other.w_link);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'pos' field */
    public java.lang.String getPos() {
      return pos;
    }
    
    /** Sets the value of the 'pos' field */
    public avroschema.linked.TokenLinked.Builder setPos(java.lang.String value) {
      validate(fields()[0], value);
      this.pos = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'pos' field has been set */
    public boolean hasPos() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'pos' field */
    public avroschema.linked.TokenLinked.Builder clearPos() {
      pos = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'ner' field */
    public java.lang.String getNer() {
      return ner;
    }
    
    /** Sets the value of the 'ner' field */
    public avroschema.linked.TokenLinked.Builder setNer(java.lang.String value) {
      validate(fields()[1], value);
      this.ner = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'ner' field has been set */
    public boolean hasNer() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'ner' field */
    public avroschema.linked.TokenLinked.Builder clearNer() {
      ner = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'span' field */
    public avroschema.linked.Span getSpan() {
      return span;
    }
    
    /** Sets the value of the 'span' field */
    public avroschema.linked.TokenLinked.Builder setSpan(avroschema.linked.Span value) {
      validate(fields()[2], value);
      this.span = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'span' field has been set */
    public boolean hasSpan() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'span' field */
    public avroschema.linked.TokenLinked.Builder clearSpan() {
      span = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'lemma' field */
    public java.lang.String getLemma() {
      return lemma;
    }
    
    /** Sets the value of the 'lemma' field */
    public avroschema.linked.TokenLinked.Builder setLemma(java.lang.String value) {
      validate(fields()[3], value);
      this.lemma = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'lemma' field has been set */
    public boolean hasLemma() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'lemma' field */
    public avroschema.linked.TokenLinked.Builder clearLemma() {
      lemma = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'word' field */
    public java.lang.String getWord() {
      return word;
    }
    
    /** Sets the value of the 'word' field */
    public avroschema.linked.TokenLinked.Builder setWord(java.lang.String value) {
      validate(fields()[4], value);
      this.word = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'word' field has been set */
    public boolean hasWord() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'word' field */
    public avroschema.linked.TokenLinked.Builder clearWord() {
      word = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'index' field */
    public java.lang.Integer getIndex() {
      return index;
    }
    
    /** Sets the value of the 'index' field */
    public avroschema.linked.TokenLinked.Builder setIndex(java.lang.Integer value) {
      validate(fields()[5], value);
      this.index = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'index' field has been set */
    public boolean hasIndex() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'index' field */
    public avroschema.linked.TokenLinked.Builder clearIndex() {
      index = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'w_link' field */
    public avroschema.linked.WikiLink getWLink() {
      return w_link;
    }
    
    /** Sets the value of the 'w_link' field */
    public avroschema.linked.TokenLinked.Builder setWLink(avroschema.linked.WikiLink value) {
      validate(fields()[6], value);
      this.w_link = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'w_link' field has been set */
    public boolean hasWLink() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'w_link' field */
    public avroschema.linked.TokenLinked.Builder clearWLink() {
      w_link = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public TokenLinked build() {
      try {
        TokenLinked record = new TokenLinked();
        record.pos = fieldSetFlags()[0] ? this.pos : (java.lang.String) defaultValue(fields()[0]);
        record.ner = fieldSetFlags()[1] ? this.ner : (java.lang.String) defaultValue(fields()[1]);
        record.span = fieldSetFlags()[2] ? this.span : (avroschema.linked.Span) defaultValue(fields()[2]);
        record.lemma = fieldSetFlags()[3] ? this.lemma : (java.lang.String) defaultValue(fields()[3]);
        record.word = fieldSetFlags()[4] ? this.word : (java.lang.String) defaultValue(fields()[4]);
        record.index = fieldSetFlags()[5] ? this.index : (java.lang.Integer) defaultValue(fields()[5]);
        record.w_link = fieldSetFlags()[6] ? this.w_link : (avroschema.linked.WikiLink) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
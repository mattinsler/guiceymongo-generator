package com.example;


// Generated file!!!  DO NOT EDIT THIS!!!

/**
 * Represents a single person
 */
public abstract class Person implements com.mattinsler.guiceymongo.data.IsData {
    public static final String IdentityKey = "_id";
    public static final String NameKey = "name";
    public static final String BirthDateKey = "birth_date";
    public static final String EyeColorKey = "eye_color";
    public static com.mattinsler.guiceymongo.data.DataWrapper<Person> DataWrapper =
        new com.mattinsler.guiceymongo.data.DataWrapper<Person>() {
            public Person.Wrapper wrap(com.mongodb.DBObject backing) {
                return Person.wrap(backing);
            }
        };

    /**
     * The MongoDB Identity of this object
     */
    public abstract boolean hasIdentity();

    /**
     * The MongoDB Identity of this object
     */
    public abstract String getIdentity();

    /**
     * Full name
     */
    public abstract boolean hasName();

    /**
     * Full name
     */
    public abstract String getName();

    /**
     *
     */
    public abstract boolean hasBirthDate();

    /**
     *
     */
    public abstract java.util.Date getBirthDate();

    /**
     * testing
     */
    public abstract boolean hasEyeColor();

    /**
     * testing
     */
    public abstract Person.EyeColor getEyeColor();

    public static Person.Wrapper wrap(com.mongodb.DBObject backing) {
        if (backing == null) {
            return null;
        }

        return new Person.Wrapper(backing);
    }

    public static Person.Wrapper convertFrom(
        com.mattinsler.guiceymongo.data.IsWrapper<?> wrapped) {
        if (wrapped == null) {
            return null;
        }

        return new Person.Wrapper(wrapped.getDBObject());
    }

    public static Person.Wrapper convertFrom(
        com.mattinsler.guiceymongo.data.IsData data) {
        if ((data == null) ||
                !(data instanceof com.mattinsler.guiceymongo.data.IsWrapper<?>)) {
            return null;
        }

        return new Person.Wrapper(((com.mattinsler.guiceymongo.data.IsWrapper<?>) data).getDBObject());
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Person value) {
        Builder builder = new Builder();

        if (value.hasIdentity()) {
            builder.setIdentity(value.getIdentity());
        }

        if (value.hasName()) {
            builder.setName(value.getName());
        }

        if (value.hasBirthDate()) {
            builder.setBirthDate(value.getBirthDate());
        }

        if (value.hasEyeColor()) {
            builder.setEyeColor(value.getEyeColor());
        }

        return builder;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj == null) || !(obj instanceof Person)) {
            return false;
        }

        Person other = (Person) obj;

        if ((this.hasIdentity() != other.hasIdentity()) ||
                (this.hasIdentity() &&
                !this.getIdentity().equals(other.getIdentity()))) {
            return false;
        }

        if ((this.hasName() != other.hasName()) ||
                (this.hasName() && !this.getName().equals(other.getName()))) {
            return false;
        }

        if ((this.hasBirthDate() != other.hasBirthDate()) ||
                (this.hasBirthDate() &&
                !this.getBirthDate().equals(other.getBirthDate()))) {
            return false;
        }

        if ((this.hasEyeColor() != other.hasEyeColor()) ||
                (this.hasEyeColor() &&
                (this.getEyeColor() != other.getEyeColor()))) {
            return false;
        }

        return true;
    }

    public static class Wrapper extends Person implements com.mattinsler.guiceymongo.data.IsWrapper<Person> {
        private com.mongodb.DBObject _backing;

        /**
         * testing
         */
        protected Person.EyeColor _eyeColor = null;

        private Wrapper(com.mongodb.DBObject backing) {
            _backing = backing;
        }

        /**
         * The MongoDB Identity of this object
         */
        @Override
        public boolean hasIdentity() {
            return _backing.containsField(IdentityKey);
        }

        /**
         * The MongoDB Identity of this object
         */
        @Override
        public String getIdentity() {
            Object value = _backing.get(IdentityKey);

            return (value == null) ? null : value.toString();
        }

        /**
         * Full name
         */
        @Override
        public boolean hasName() {
            return _backing.containsField(NameKey);
        }

        /**
         * Full name
         */
        @Override
        public String getName() {
            return (String) _backing.get(NameKey);
        }

        /**
         *
         */
        @Override
        public boolean hasBirthDate() {
            return _backing.containsField(BirthDateKey);
        }

        /**
         *
         */
        @Override
        public java.util.Date getBirthDate() {
            return (java.util.Date) _backing.get(BirthDateKey);
        }

        /**
         * testing
         */
        @Override
        public boolean hasEyeColor() {
            return _backing.containsField(EyeColorKey);
        }

        /**
         * testing
         */
        @Override
        public Person.EyeColor getEyeColor() {
            if (_eyeColor == null) {
                String value = (String) _backing.get(EyeColorKey);

                if (value != null) {
                    try {
                        _eyeColor = Person.EyeColor.valueOf(value);
                    } catch (Exception e) {
                    }
                }
            }

            return _eyeColor;
        }

        public com.mongodb.DBObject getDBObject() {
            return _backing;
        }
    }

    public static class Builder extends Person implements com.mattinsler.guiceymongo.data.IsBuilder<Person> {
        /**
         * The MongoDB Identity of this object
         */
        protected String _identity = null;

        /**
         * Full name
         */
        protected String _name = null;

        /**
         *
         */
        protected java.util.Date _birthDate = null;

        /**
         * testing
         */
        protected Person.EyeColor _eyeColor = null;

        private Builder() {
        }

        /**
         * The MongoDB Identity of this object
         */
        @Override
        public boolean hasIdentity() {
            return _identity != null;
        }

        /**
         * The MongoDB Identity of this object
         */
        @Override
        public String getIdentity() {
            return _identity;
        }

        /**
         * The MongoDB Identity of this object
         */
        public Builder setIdentity(String value) {
            _identity = value;

            return this;
        }

        /**
         * The MongoDB Identity of this object
         */
        public Builder clearIdentity() {
            _identity = null;

            return this;
        }

        /**
         * Full name
         */
        @Override
        public boolean hasName() {
            return _name != null;
        }

        /**
         * Full name
         */
        @Override
        public String getName() {
            return _name;
        }

        /**
         * Full name
         */
        public Builder setName(String value) {
            _name = value;

            return this;
        }

        /**
         * Full name
         */
        public Builder clearName() {
            _name = null;

            return this;
        }

        /**
         *
         */
        @Override
        public boolean hasBirthDate() {
            return _birthDate != null;
        }

        /**
         *
         */
        @Override
        public java.util.Date getBirthDate() {
            return _birthDate;
        }

        /**
         *
         */
        public Builder setBirthDate(java.util.Date value) {
            _birthDate = value;

            return this;
        }

        /**
         *
         */
        public Builder clearBirthDate() {
            _birthDate = null;

            return this;
        }

        /**
         * testing
         */
        @Override
        public boolean hasEyeColor() {
            return _eyeColor != null;
        }

        /**
         * testing
         */
        @Override
        public Person.EyeColor getEyeColor() {
            return _eyeColor;
        }

        /**
         * testing
         */
        public Builder setEyeColor(Person.EyeColor value) {
            _eyeColor = value;

            return this;
        }

        /**
         * testing
         */
        public Builder clearEyeColor() {
            _eyeColor = null;

            return this;
        }

        public com.mongodb.DBObject build() {
            com.mongodb.DBObject dbObject = new com.mongodb.BasicDBObject();

            if (_identity != null) {
                dbObject.put(IdentityKey, _identity);
            }

            if (_name != null) {
                dbObject.put(NameKey, _name);
            }

            if (_birthDate != null) {
                dbObject.put(BirthDateKey, _birthDate);
            }

            if (_eyeColor != null) {
                dbObject.put(EyeColorKey, _eyeColor.name());
            }

            return dbObject;
        }
    }

    /**
     * Color of eye
     */
    public static enum EyeColor {Blue,
        Green,
        Hazel,
        Brown;
    }
}

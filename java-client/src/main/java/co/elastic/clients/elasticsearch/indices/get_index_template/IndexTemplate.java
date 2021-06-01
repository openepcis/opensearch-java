/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.indices.get_index_template;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.get_index_template.IndexTemplate
public final class IndexTemplate implements ToJsonp {
	private final List<String> indexPatterns;

	private final List<String> composedOf;

	private final IndexTemplateSummary template;

	@Nullable
	private final Number version;

	@Nullable
	private final Number priority;

	@Nullable
	private final Map<String, JsonValue> _meta;

	@Nullable
	private final Boolean allowAutoCreate;

	@Nullable
	private final Map<String, JsonValue> dataStream;

	// ---------------------------------------------------------------------------------------------

	protected IndexTemplate(Builder builder) {

		this.indexPatterns = Objects.requireNonNull(builder.indexPatterns, "index_patterns");
		this.composedOf = Objects.requireNonNull(builder.composedOf, "composed_of");
		this.template = Objects.requireNonNull(builder.template, "template");
		this.version = builder.version;
		this.priority = builder.priority;
		this._meta = builder._meta;
		this.allowAutoCreate = builder.allowAutoCreate;
		this.dataStream = builder.dataStream;

	}

	/**
	 * API name: {@code index_patterns}
	 */
	public List<String> indexPatterns() {
		return this.indexPatterns;
	}

	/**
	 * API name: {@code composed_of}
	 */
	public List<String> composedOf() {
		return this.composedOf;
	}

	/**
	 * API name: {@code template}
	 */
	public IndexTemplateSummary template() {
		return this.template;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code priority}
	 */
	@Nullable
	public Number priority() {
		return this.priority;
	}

	/**
	 * API name: {@code _meta}
	 */
	@Nullable
	public Map<String, JsonValue> _meta() {
		return this._meta;
	}

	/**
	 * API name: {@code allow_auto_create}
	 */
	@Nullable
	public Boolean allowAutoCreate() {
		return this.allowAutoCreate;
	}

	/**
	 * API name: {@code data_stream}
	 */
	@Nullable
	public Map<String, JsonValue> dataStream() {
		return this.dataStream;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("index_patterns");
		generator.writeStartArray();
		for (String item0 : this.indexPatterns) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("composed_of");
		generator.writeStartArray();
		for (String item0 : this.composedOf) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("template");
		this.template.toJsonp(generator, mapper);

		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version.doubleValue());

		}
		if (this.priority != null) {

			generator.writeKey("priority");
			generator.write(this.priority.doubleValue());

		}
		if (this._meta != null) {

			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this._meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.allowAutoCreate != null) {

			generator.writeKey("allow_auto_create");
			generator.write(this.allowAutoCreate);

		}
		if (this.dataStream != null) {

			generator.writeKey("data_stream");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.dataStream.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexTemplate}.
	 */
	public static class Builder implements ObjectBuilder<IndexTemplate> {
		private List<String> indexPatterns;

		private List<String> composedOf;

		private IndexTemplateSummary template;

		@Nullable
		private Number version;

		@Nullable
		private Number priority;

		@Nullable
		private Map<String, JsonValue> _meta;

		@Nullable
		private Boolean allowAutoCreate;

		@Nullable
		private Map<String, JsonValue> dataStream;

		/**
		 * API name: {@code index_patterns}
		 */
		public Builder indexPatterns(List<String> value) {
			this.indexPatterns = value;
			return this;
		}

		/**
		 * API name: {@code index_patterns}
		 */
		public Builder indexPatterns(String... value) {
			this.indexPatterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indexPatterns(List)}, creating the list if needed.
		 */
		public Builder addIndexPatterns(String value) {
			if (this.indexPatterns == null) {
				this.indexPatterns = new ArrayList<>();
			}
			this.indexPatterns.add(value);
			return this;
		}

		/**
		 * API name: {@code composed_of}
		 */
		public Builder composedOf(List<String> value) {
			this.composedOf = value;
			return this;
		}

		/**
		 * API name: {@code composed_of}
		 */
		public Builder composedOf(String... value) {
			this.composedOf = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #composedOf(List)}, creating the list if needed.
		 */
		public Builder addComposedOf(String value) {
			if (this.composedOf == null) {
				this.composedOf = new ArrayList<>();
			}
			this.composedOf.add(value);
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public Builder template(IndexTemplateSummary value) {
			this.template = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public Builder template(Function<IndexTemplateSummary.Builder, ObjectBuilder<IndexTemplateSummary>> fn) {
			return this.template(fn.apply(new IndexTemplateSummary.Builder()).build());
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code priority}
		 */
		public Builder priority(@Nullable Number value) {
			this.priority = value;
			return this;
		}

		/**
		 * API name: {@code _meta}
		 */
		public Builder _meta(@Nullable Map<String, JsonValue> value) {
			this._meta = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #_meta(Map)}, creating the map if needed.
		 */
		public Builder put_meta(String key, JsonValue value) {
			if (this._meta == null) {
				this._meta = new HashMap<>();
			}
			this._meta.put(key, value);
			return this;
		}

		/**
		 * API name: {@code allow_auto_create}
		 */
		public Builder allowAutoCreate(@Nullable Boolean value) {
			this.allowAutoCreate = value;
			return this;
		}

		/**
		 * API name: {@code data_stream}
		 */
		public Builder dataStream(@Nullable Map<String, JsonValue> value) {
			this.dataStream = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #dataStream(Map)}, creating the map if needed.
		 */
		public Builder putDataStream(String key, JsonValue value) {
			if (this.dataStream == null) {
				this.dataStream = new HashMap<>();
			}
			this.dataStream.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link IndexTemplate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexTemplate build() {

			return new IndexTemplate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for IndexTemplate
	 */
	public static final JsonpValueParser<IndexTemplate> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, IndexTemplate::setupIndexTemplateParser);

	protected static void setupIndexTemplateParser(DelegatingJsonpValueParser<IndexTemplate.Builder> op) {

		op.add(Builder::indexPatterns, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()), "index_patterns");
		op.add(Builder::composedOf, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()), "composed_of");
		op.add(Builder::template, IndexTemplateSummary.JSONP_PARSER, "template");
		op.add(Builder::version, JsonpValueParser.numberParser(), "version");
		op.add(Builder::priority, JsonpValueParser.numberParser(), "priority");
		op.add(Builder::_meta, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()), "_meta");
		op.add(Builder::allowAutoCreate, JsonpValueParser.booleanParser(), "allow_auto_create");
		op.add(Builder::dataStream, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()),
				"data_stream");

	}

}
/* LanguageTool, a natural language style checker
 * Copyright (C) 2007 Daniel Naber (http://www.danielnaber.de)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package org.languagetool.language;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import org.languagetool.Language;
import org.languagetool.rules.*;
// import org.languagetool.rules.spelling.hunspell.HunspellRule;
// import org.languagetool.synthesis.Synthesizer;
//import org.languagetool.synthesis.gd.ScottishGaelicSynthesizer;
// import org.languagetool.tagging.Tagger;
// import org.languagetool.tagging.disambiguation.Disambiguator;
// import org.languagetool.tagging.disambiguation.rules.XmlRuleDisambiguator;
//import org.languagetool.tagging.gd.ScottishGaelicTagger;
//import org.languagetool.tokenizers.SRXSentenceTokenizer;
//import org.languagetool.tokenizers.SentenceTokenizer;
//import org.languagetool.tokenizers.Tokenizer;
//import org.languagetool.tokenizers.gd.ScottishGaelicWordTokenizer;

public class ScottishGaelic extends Language {
/*
  private Tagger tagger;
  private Tokenizer wordTokenizer;
  private SentenceTokenizer sentenceTokenizer;
  private Synthesizer synthesizer;
  private Disambiguator disambiguator;

  @Override
  public SentenceTokenizer getSentenceTokenizer() {
    if (sentenceTokenizer == null) {
      sentenceTokenizer = new SRXSentenceTokenizer(this);
    }
    return sentenceTokenizer;
  }
*/
  @Override
  public String getName() {
    return "Scottish Gaelic";
  }

  @Override
  public String getShortCode() {
    return "gd";
  }

  @Override
  public String[] getCountries() {
    return new String[]{"GB, CA"};
  }
/*
  @Override
  public Tagger getTagger() {
    if (tagger == null) {
      tagger = new ScottishGaelicTagger();
    }
    return tagger;
  }

  @Override
  public Tokenizer getWordTokenizer() {
    if (wordTokenizer == null) {
      wordTokenizer = new ScottishGaelicWordTokenizer();
    }
    return wordTokenizer;
  }

  @Override
  public Synthesizer getSynthesizer() {
    if (synthesizer == null) {
      synthesizer = new ScottishGaelicSynthesizer();
    }
    return synthesizer;
  }

  @Override
  public Disambiguator getDisambiguator() {
    if (disambiguator == null) {
      disambiguator = new XmlRuleDisambiguator(new ScottishGaelic());
    }
    return disambiguator;
  }

    @Override
    public List<Rule> getRelevantRules(ResourceBundle messages) throws IOException {
      return Arrays.asList(
              new CommaWhitespaceRule(messages),
              new DoublePunctuationRule(messages),
              new GenericUnpairedBracketsRule(messages,
                      Arrays.asList("[", "(", "{", "“", "«", "»", "‘", "\"", "'"),
                      Arrays.asList("]", ")", "}", "”", "»", "«", "’", "\"", "'")),
              new HunspellRule(messages, this),
              new UppercaseSentenceStartRule(messages, this),
              new MultipleWhitespaceRule(messages, this),
              // Specific to Galician:
              new SimpleReplaceRule(messages),
              new CastWordsRule(messages)
      );
    }

*/
  @Override
  public Contributor[] getMaintainers() {
    return new Contributor[] { new Contributor("Catrìona Anderson") };
  }

}
